package data_structure;
import java.util.Arrays;
import java.util.Scanner;

public class zero {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		int arr [] = new int [n];
		int sum = 0;
		for(int i=0; i<n; i++) {
			int n1 = sc.nextInt();
			if(n1!=0) {
				arr[i] = n1;
				sum += n1;
			}else if(n1 ==0 ) {
				for(int j=i; j>=0; j--) {
					if(arr[j] != 0) {
						sum -= arr[j];
						arr[j] = 0;
						break;
					}
				}				
			}
		}
		
		System.out.println(sum);

		
	}

}
