/*
Возведение в степень
Напишите функцию возведения числа в степень pow.

Входные данные
Вводится 2 числа - a (вещественное) и n (целое неотрицательное).

Выходные данные
Необходимо вывести  значение an.

Пользоваться функцией pow из библиотеки Math запрещено. Содержание функции main менять запрещено.

Sample Input:
2
5

Sample Output:
32.0
*/
package oop.Решение_задач_с_использованием_функций;

import java.util.Scanner;

public class task_6 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(a,n));
    }
    public static double pow(double a,int n){
        //задаем переменную для хранения результата
        double result=1;
        //возводить a в степень n будем через цикл while
        //если n>0
        while(n>0){
            //1*a
            result*=a;
            //и n-1;пока n не будет меньше 0
            n--;
        }
        //возвращаем результат
        return result;
    }
}
