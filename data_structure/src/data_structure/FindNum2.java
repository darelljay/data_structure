package data_structure;
import java.util.Arrays;
import java.util.Scanner;
public class FindNum2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		int array1 [] = new int [n1];
		
		for(int i=0; i<array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		
		Arrays.sort(array1);
		
		
	}
	
	public static int binarySearch(int arr[],int target) {
		int right = 0;
		int left = arr.length -1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			
			if(target==arr[mid]) {
				return 0; 
			}else if(target < arr[mid]) {
				right = mid-1;
			}else {
				left = mid + 1;
			}
			return -1;
		}
		return target;
	}
}
