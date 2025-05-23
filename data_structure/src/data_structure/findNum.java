package data_structure;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.Stack;
public class findNum {
	
	public static void main(String[] args) {
// 		내가 처음에 작성한 코드 
//      결과: 시간초과
//		이유: Scanner와 println 반복 호출로 인한 I/O 오버헤드가 크고(20만 건 처리 시 수십 ms 단위 지연),
//			 직접 구현한 이분 탐색과 System.out 출력 방식이 JVM 최적화의 이점을 살리지 못해 시간 초과
//			입력값이 작아서 그렇게 큰 시간이 소요되지 않았지만 만일 100같은 숫자가 나왔으면 일일히 그걸 다 직접 
//			비교하면서 찾기떄문에 입력값이 커질수록 소요되는 시간이 늘어남 
//		오늘 공부 할거: String builder 
//		Scanner sc = new Scanner(System.in);
//		Stack st = new Stack();
//		
//		int input = sc.nextInt();
//		
//		for(int i=0; i<input; i++) {
//			int sn = (int) st.push(sc.nextInt());
//		}
//		
//		int input2 = sc.nextInt();
//		
//		for(int i=0; i<input2; i++) {
//			int sn = sc.nextInt();
//			System.out.println(st.contains(sn) ? 1:0);
//		}
		
		  Scanner sc = new Scanner(System.in);
	        StringBuilder sb = new StringBuilder(); // 최대한 시간을 줄이기위해 StringBuilder사용

	        int N = sc.nextInt();
	        int[] A = new int[N];

	        for (int i = 0; i < A.length; i++) {
	            A[i] = sc.nextInt();
	        }

	        int M = sc.nextInt();

	        Arrays.sort(A); // 이진탐색은 정렬 후에 사용해야 하므로 선정렬
	        
	        for (int i = 0; i < M; i++) {
	            if (binarySearch(A, sc.nextInt()) >= 0) {
	                sb.append(1).append("\n");
	            } else sb.append(0).append("\n");
	        }

	        System.out.println(sb);

		
	}
	// 이진 탐색함수
	public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            if(target == arr[mid]){
                return 0;
            }
            else if(target < arr[mid]){
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return -1;
    }
}
