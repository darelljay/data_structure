package data_structure;
import java.util.Stack;
import java.util.Scanner;
public class st_sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack();
		int n = sc.nextInt();
		int[] arr = new int [n];
		Stack<Integer> answer = new Stack();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i = 0;
		int target_num = 0;
		int current_num = 1; 
		boolean push = true;
		while(answer.size()!=arr.length) {
			target_num = arr[i];
			if(!st.isEmpty() && target_num==(int)st.lastElement()) {				
				answer.push(st.pop());
				i++;
				push = false;
				sb.append("- \n");
			}else {
				push = true;
			}
			if(push) {
				st.push(current_num);	
				current_num++;
				sb.append("+ \n");
			}
			
			
			if (current_num > target_num && !st.isEmpty() && (int)st.lastElement() > target_num) {
			    sb = null;
			    break;
			}
		}
		System.out.println(sb==null? "NO":sb);
	}

}
