package data_structure;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Card {

	public static int countNotZero(int arr[]) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				count++;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (countNotZero(arr) > 1) {
				arr[0 + i] = 0;
				for (int j = i + 1; j < arr.length - 1; j++) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			} else {
				System.out.println(arr[0 + i]);
			}
		}
	}

}
