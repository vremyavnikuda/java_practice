/*
Площадь поверхности параллелепипеда
Напишите функцию area, которая принимает на вход 3 натуральных числа - ширину,
высоту и длину прямоугольного параллелепипеда, а находит и выводит на экран площадь его поверхности.
Содержание функции main менять запрещено.

Sample Input:
3
4
5

Sample Output:
94
*/
package oop.recursion;
import java.util.Scanner;

public class return1 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        area(a,b,c);
    }
    public static void area(int a,int b,int c){
        int i = 2*(a * b + b * c + a * c);
        System.out.println(i);
    }
}
