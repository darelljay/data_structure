package data_structure;

import java.util.Scanner;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		Stack st = new Stack();
		for (int i = 0; i <=num; i++) {
			String input = sc.nextLine();
			if (input.contains("push")) {
				String new_input = input.replaceAll("[^0-9]", "");
				st.push(new_input);
			} else if (input.equals("pop")) {
				if (st.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(st.peek());
					st.pop();
				}
			} else if ((input.equals("size"))) {
				System.out.println(st.size());
			}else if(input.equals("empty")) {
				if(st.isEmpty()) {
					System.out.println(1);
				}else {					
					System.out.println(0);
				}
			}else if(input.equals("top")) {
				if(!st.isEmpty()) {
					System.out.println(st.peek());
				}else {					
					System.out.println(-1);
				}
				
			}

		}
	}

}
