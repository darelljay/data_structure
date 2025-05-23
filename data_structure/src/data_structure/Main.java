package data_structure;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		

		for (int i = 0; i < num; i++) {
			String v = sc.next();
			
			String res = "YES";
			
			Stack st = new Stack();	
			
			for(int j=0; j<v.length(); j++) {
				if(v.charAt(j) =='(') {
					st.push(1);
				}
				
				else if(v.charAt(j)==')'){
					if(st.isEmpty()) {
						res = "NO";
						break;
					}
					else {
						st.pop();
					}
				}
			}
			if(!st.isEmpty()) {
				res="NO";
			}
			
			System.out.println(res);
		}

	}
}
