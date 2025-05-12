package data_structure;


import java.util.*;

public class Card2 {
	
    static int lowerBound(int[] a, int key) {
        int lo = 0, hi = a.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] >= key) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
    
    static int upperBound(int[] a, int key) {
        int lo = 0, hi = a.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] > key) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) cards[i] = sc.nextInt();
        Arrays.sort(cards);  // 정렬!

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int q = sc.nextInt();
            int cnt = upperBound(cards, q) - lowerBound(cards, q);
            sb.append(cnt).append(' ');
        }
        System.out.println(sb);
    }
}
