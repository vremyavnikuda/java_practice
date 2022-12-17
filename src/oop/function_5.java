/*
Простое число
Напишите функцию simple, которая принимает одно целое число и определяет, является ли число простым и выводит на экран ответ: "YES"/"NO". Содержание функции main менять запрещено.

Sample Input:
3
4
19

Sample Output:
YES
NO
YES
*/
package oop;

import java.math.BigInteger;
import java.util.Scanner;

public class function_5 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        simple(a);
        simple(b);
        simple(c);
    }

    private static void simple(int a){
        //флаг начального значения
        boolean probablePrime=false;
        //определяем является ли число простым методом Рабина-Миллера
        BigInteger bigInteger = BigInteger.valueOf(a);
        probablePrime = bigInteger.isProbablePrime((int) Math.log(a));
        //так же добавляем исключения в условие a!=1&&a!=0&&a!=1
        if (probablePrime==true&&a!=1&&a!=0&&a!=-1){
            //если число простое
            System.out.println("YES");
        }else {
            //если нет
            System.out.println("NO");
        }
    }
}
