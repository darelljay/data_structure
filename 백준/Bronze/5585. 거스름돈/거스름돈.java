import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] change = {500,100,50,10,5,1};

        int m = sc.nextInt();
        int n = 1000 - m;


        int num = 0;
        for(int i=0; i<6; i++){
            if(n/change[i]>0 || n%change[i]==0){

                    num += n/change[i];
                    n %= change[i];

            }
        }
        System.out.println(num);
    }
}
