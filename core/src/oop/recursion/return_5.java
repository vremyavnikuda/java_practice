/*
Факториал
Напишите рекурсивную функцию factorial, которая принимает как аргумент одно неотрицательное целое число и возвращает
его значение. Напоминаю, что 0! = 1.  Содержание функции main менять запрещено.

Sample Input:
5

Sample Output:
120
*/
package oop.recursion;

import java.util.Scanner;

public class return_5 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(factorial(n));
    }
    //Функция факториал ,которая принимает одно неотрицательное число и возвращает его значение
    public static long factorial(int n){
        //Базовый случай 0!=1
        if (n==0){
            return 1;
        }
        //Рекурсивный случай n!=n*(n-1)
        return n*factorial(n-1);
    }
}
