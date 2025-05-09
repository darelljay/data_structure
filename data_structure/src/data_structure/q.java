package data_structure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		
		
		while(q.size()>1) {
			q.poll();
			int temp = q.poll();
			q.add(temp);
		}
//		1234
		System.out.println(q.poll());

		
	}

}
