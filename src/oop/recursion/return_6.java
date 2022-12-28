/*
Число секунд
Напишите функцию second_count, которая принимает как целочисленные аргументы количество дней, часов, минут и секунд,
которые прошли со времён какого - либо момента. Ваша функция должна вернуть одно целое число - количество секунд,
которое прошло с того момента.  Содержание функции main менять запрещено.

Sample Input:
0
1
1
15

Sample Output:
Секунд прошло: 3675
*/
package oop.recursion;

import java.util.Scanner;

public class return_6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int d= sc.nextInt();
        int h= sc.nextInt();
        int m= sc.nextInt();
        int s= sc.nextInt();
        System.out.println("Секунд прошло: " + second_count(d, h, m, s));
    }
    public static int second_count(int d,int h,int m,int s){
        //кол-во секунд в дне
        int secondsDay=24*60*60;
        //Кол-во секунд в часе
        int secondHour=60*60;
        //Кол-во секунд в минуте
        int secondMinute=60;

        //Общее ко-во секунд ,которое прошло с момента
        int totalSecond=d*secondsDay+h*secondHour+m*secondMinute+s;
        return totalSecond;
    }
}
