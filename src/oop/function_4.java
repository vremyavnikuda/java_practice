/*
Площадь и периметр
Необходимо написать программу для поиска площади и периметра квадрата или круга.
Напишите две функции: perimeter и area, каждая из них принимает строку - название фигуры и одно целое число
(либо радиус круга, либо сторону квадрата). Как результат они выводят периметр и площадь фигуры соответственно.
В ответ они должны вывести именно целое число (при надобности округлять "вверх", то есть до ближайшего большего
целого числа). Содержание функции main менять запрещено. Пи брать как 3.14.

Sample Input 1:

Квадрат
5

Sample Output 1:
20
25

Sample Input 2:
Круг
3

Sample Output 2:
19
29
*/
package oop;

import java.util.Scanner;

public class function_4 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String figure=sc.nextLine();
        int x= sc.nextInt();
        area(figure,x);
        perimeter(figure,x);
    }
    private static void perimeter(String figure,int x){

        if ("Круг".equals(figure)){
            //периметр круга
            int p=(int)Math.ceil(Math.PI*Math.pow(x,2));
            System.out.println(p);
        }else{
            //площадь круга
            int s=(int)Math.ceil(x*x);
            System.out.println(s);

        }
    }
    private static void area(String figure,int x){
        if ("Квадрат".equals(figure)){
            //периметр квадрата
            int p=4*x;
            System.out.println(p);
        }else {
            //площадь квадрата
            int s=(int)Math.ceil(Math.PI*x*2);
            System.out.println(s);
        }
    }
}
