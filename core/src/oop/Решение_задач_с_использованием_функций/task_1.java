/*
Минимум из 4 чисел
Напишите функцию int min (int a, int b, int c, int d) ,
находящую наименьшее из четырех данных чисел и возвращающую ответ.

Входные данные
Вводится четыре числа.

Выходные данные
Необходимо вывести  наименьшее из 4-х данных чисел.

Содержание функции main менять запрещено.

Sample Input:
3
1
2
6

Sample Output:
1
*/
package oop.Решение_задач_с_использованием_функций;

import java.util.Scanner;

public class task_1 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(min(a,b,c,d));
    }
    public static int  min(int a,int b,int c,int d){
        int min=Math.min(a,Math.min(b,Math.min(c,d)));
        return min;
    }
}
