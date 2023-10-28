/*
Первая строка, сумма которой кратна 7?
Напишите функцию find_line7, которая принимает на вход двумерный массив целых чисел и возвращает в ответ индекс первой
строчки, сумма элементов которой кратна 7. Если такой строки нет, то возвращает значение -1.

Sample Input:
4
1 2 4 3 5
3 2 4 4 1
6 5 0 4 6 7 5
1 2 1 2 1 2 2 1 1

Sample Output:
Сумма строки под номером 2 кратна 7
*/
package oop.recursion;

import java.util.Scanner;

public class return_7 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int [][]mas=new int[n][];
        for (int i=0;i<n;i++){
            String line= sc.nextLine();
            String[]numbers=line.split(" ");
            int []a=new int[numbers.length];
            for (int j=0;j<numbers.length;j++)
                a[j]=Integer.parseInt(numbers[j]);
            mas[i]=a;
        }
        int ans=find_line7(mas);
        if (ans!=-1)
            System.out.println("Сумма строки под номером " + (ans + 1) + " кратна 7");
        else
            System.out.println("Таких строк нет");
    }
    public static int find_line7(int [][]mas){
        //Перебираем все строки массива
        for (int i=0;i< mas.length;i++){
            int sum=0;
            //Суммируем элементы текущей строки
            for (int j=0;j<mas[i].length;j++){
                sum+=mas[i][j];
            }
            //Если сумма элементов строки кратна 7 ,возвращаем ее индекс
            if (sum%7==0){
                return i;
            }
        }
        //Если такой строки нет ,возвращаем -1
        return -1;
    }
}
