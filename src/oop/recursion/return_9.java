/*
Функция Аккермана
Напишите рекурсивную функцию akkerman, которая принимает как аргумент два неотрицательных целых числа и возвращает
значение этой функции.  Содержание функции main менять запрещено.

Sample Input:
2
2

Sample Output:
7
*/
package oop.recursion;

import java.util.Scanner;

public class return_9 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        System.out.println(akkerman(m,n));
    }
    public static int akkerman(int m,int n){
        if (m==0){
            return n+1;
        }
        else if (m>0&&n==0){
            return akkerman(m-1,1);
        } else if (m>0&&n>0) {
            return akkerman(m-1,akkerman(m,n-1));
        }else {
            //неправильные входные данные
            return -1;
        }
    }
}
