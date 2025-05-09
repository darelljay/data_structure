package data_structure;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Deque<String> q = new LinkedList<String>();

		for (int i = 0; i <= num; i++) {
			String input = sc.nextLine();
			if (input.contains("push")) {
				String new_input = input.replaceAll("[^0-9]", "");
				q.offer(new_input);
			}else if(input.contains("pop")) {
				System.out.println(q.isEmpty()? -1:q.poll());
			}else if(input.contains("size")) {
				System.out.println(q.size());
			}else if(input.contains("empty")) {
				System.out.println(q.isEmpty()? "1":"0");
			}else if(input.contains("front")) {
				System.out.println(q.isEmpty() ? "-1":q.peek());
			} else if(input.contains("back")) {
				System.out.println(q.isEmpty() ? "-1":q.getLast());
			}
		}
	}
}
