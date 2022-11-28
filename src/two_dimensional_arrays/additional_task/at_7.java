package two_dimensional_arrays.additional_task;

import java.util.Scanner;

public class at_7 {
    public static void main (String[]args){
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int [][]array=new int[n][n];
        for (int i= 0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                array[i][j]= in.nextInt();
            }
        }
        int q1=0,q2=0;
        for(int i=0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                if (i<j){
                    q1=q1+ array[i][j];
                    continue;
                }
                if (i>j){
                    q2=q2+ array[i][j];
                }
            }
        }
        if (q1==q2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
