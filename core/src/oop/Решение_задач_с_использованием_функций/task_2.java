/*
Исключающее ИЛИ
Напишите функцию xor реализующую функцию "Исключающее ИЛИ" двух логических переменных x и y.
Функция Xor должна возвращать true, если ровно один из ее аргументов x или y, но не оба одновременно равны true.

Входные данные
Вводится 2 числа - x и y (x и y равны 0 или 1, 0 соответствует значению false, 1 соответствует значению true).

Выходные данные
Необходимо вывести false или true - значение функции от x и y.

Содержание функции main менять запрещено.

Sample Input:
1
0

Sample Output:
true
*/
package oop.Решение_задач_с_использованием_функций;

import java.util.Scanner;

public class task_2 {
  public static void main (String[]args){
      Scanner sc=new Scanner(System.in);
      boolean f=sc.nextInt() !=0;
      boolean s=sc.nextInt() !=0;
      System.out.println(xor(f,s));
  }
    public static boolean xor(boolean f,boolean s) {

      return f!=s;
    }
}