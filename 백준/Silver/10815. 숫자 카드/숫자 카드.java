import java.io.*;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int fn = Integer.parseInt(br.readLine());
        StringTokenizer stkn = new StringTokenizer(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        while (stkn.hasMoreTokens()) {
            set.add(Integer.parseInt(stkn.nextToken()));
        }

        int sn = Integer.parseInt(br.readLine());
        StringTokenizer stkn2 = new StringTokenizer(br.readLine());

        while (stkn2.hasMoreTokens()) {
                int n = Integer.parseInt(stkn2.nextToken());
               sb.append(set.contains(n)?"1 ":"0 ");
        }



        System.out.println(sb.toString().trim());


    }
}
