
import java.util.Arrays;
import  java.util.Scanner;
public class BigNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int [] arr = new int [n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        Boolean isCountMax = false ;
        int count = 0;
        for(int i=0; i<m; i++){
            int maxNum;

            if(count >= k){
                isCountMax = true;
            }
            System.out.println("isCountMax? "+isCountMax);
            if(isCountMax){
                maxNum = arr[arr.length-2];
            }else{
                maxNum = arr[arr.length-1];
            }

            System.out.println("maxNum is "+maxNum);

            if(count < k && !isCountMax){
                sum += maxNum;
                count++;
                System.out.println(maxNum + "+" + count);
            }else if(isCountMax){
                count =0;
                isCountMax = false;
                sum += maxNum;
                System.out.println(maxNum + "+" + count);
            }





//            prevMax = arr[arr.length-1];
//            prevIdx = arr.length-1;
        }
        System.out.println(sum);
    }
}
