package arrays_sample_tasks;

import java.util.Scanner;

public class arrst_2 {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        //длинна массива
        int n= sc.nextInt();
        //инициализация массива
        int array[]=new int[n];
        //условие заполнение массива
        for(int i=0;i<array.length;i++){
            //условие изменение массива
            array[i]=i*i;
            //вывод массива
            System.out.print(array[i]+" ");
        }
    }
}
