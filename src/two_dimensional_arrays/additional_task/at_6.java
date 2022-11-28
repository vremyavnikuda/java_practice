package two_dimensional_arrays.additional_task;

import java.util.Scanner;

public class at_6 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int [][]arrays=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(i==j)
                    arrays[i][j]=1;
                if(j>i)
                    arrays[i][j]=0;
                if(i>j)
                    arrays[i][j]=2;
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println();
        }
    }
}
