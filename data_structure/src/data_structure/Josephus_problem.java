package data_structure;

import java.util.*;

public class Josephus_problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		ArrayList<Integer> lst2 = new ArrayList<Integer>();

		for(int i=1; i<=n; i++) {
			lst1.add(i);
		}
		int index = 0;
		while(!lst1.isEmpty()) {
			index = (index+k-1)%lst1.size();
			lst2.add(lst1.remove(index));
		}

		System.out.print("<");
		for(int i=0; i<lst2.size(); i++) {
			System.out.print((lst2.size()-1==i) ? lst2.get(i):lst2.get(i)+", ");
		}
		System.out.print(">");
    }
}
