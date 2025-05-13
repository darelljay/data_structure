package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<Integer.parseInt(input[0]); i++) {
			set.add(br.readLine());
		}
		
		ArrayList<String> result = new ArrayList<String>();
		for(int i=0; i<Integer.parseInt(input[1]); i++) {
			String temp = br.readLine();
			if(set.contains(temp)) {
				result.add(temp);
			}
		}
		Collections.sort(result);
		System.out.println(result.size());
		for(String s:result) {
			System.out.println(s);
		}
	}

}
