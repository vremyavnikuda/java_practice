package oop;

import java.util.Arrays;
import java.util.Scanner;

public class function_9 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int [][]mas=new int [n][];
        for (int i=0;i<n;i++){
            String line=sc.nextLine();
            String[]numbers=line.split(" ");
            int []a=new int[numbers.length];
            for (int j=0;j< numbers.length;j++)
                a[j]=Integer.parseInt(numbers[j]);
            mas[i]=a;

        }
        maximin(mas);
    }
    public static void maximin(int [][]mas){
        int n= mas.length;
        int []min =new int[n];
        for (int i=0;i< n;i++){
            Arrays.sort(mas[i]);
            min[i]=mas[i][0];
        }
        Arrays.sort(min);
        System.out.println(min[min.length-1]);
    }
}
