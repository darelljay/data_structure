import java.util.*;
import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0; i<num; i++) {

            int n = sc.nextInt();
           if(n==0) {
               if(pq.isEmpty()){
                   System.out.println(0);
               }else{
                   System.out.println(pq.peek());
                   pq.remove(pq.peek());
               }
           }else{
               pq.add(n);
           }
        }
//            System.out.println(Arrays.toString(asc_queue.toArray()));

    }
    }
