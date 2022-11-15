package cycle_for;

import java.util.Scanner;

public class cf {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int q_sum=0;
        for(int i=0;i<q;i++) {
            int x = sc.nextInt();
            q_sum += x;
        }
        System.out.print(q_sum);
    }
}
