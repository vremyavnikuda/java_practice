/*
Простые числа на промежутке
Напишите функцию simpleAB, которая принимает 2 натуральных числа a и b (a <= b) и
анализирует все числа на промежутке от a до b включительно на их простоту.
Она должна вывести на экран для каждого числа строку вида "{число} - {простое/составное/1}".
Содержание функции main менять запрещено.

Sample Input:
1
6

Sample Output:
1 - 1
2 - простое
3 - простое
4 - составное
5 - простое
6 - составное
*/
package oop.test;

import java.math.BigInteger;
import java.util.Scanner;

public class function_6 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        simpleAB(x,y);
    }
    public static void simpleAB(int x,int y){
        boolean probablePrime=false;
        for (int i=x;i<=y;i++){
            if (i==1){
                System.out.println("1 - 1");
            }
            if (i>1) {
                BigInteger bigInteger = BigInteger.valueOf(i);
                probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
                if (probablePrime == true) {
                    System.out.println(i + " - " + "простое");
                }
                if (i == 1) {
                    System.out.println(1 + " - " + "1");
                }
                if (probablePrime == false) {
                    System.out.println(i + " - " + "составное");
                }
            }
        }
    }
}
