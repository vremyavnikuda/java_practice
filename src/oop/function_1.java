/*
Произведение трёх чисел
Напишите функцию multiply, которая будет принимать в себя три целых числа и распечатывать на строке их произведение.
Содержание функции main менять запрещено.

Sample Input:
2
3
4

Sample Output:
24
*/
package oop;
import java.util.Scanner;
public class function_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        multiply(a,b,c);
    }
    //функция произведения чисел
    static void multiply(int a,int b,int c){
        int z=a*b*c;
        System.out.println(z);
    }
}
