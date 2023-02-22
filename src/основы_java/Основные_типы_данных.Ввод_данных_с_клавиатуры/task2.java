package основы_java.Основные_типы_данных.Ввод_данных_с_клавиатуры;

import java.util.Scanner;
/*
Произведение
Напишите программу, которая считывает три целых числа и выводит их произведение.
*/
public class task2 {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b=input.nextInt();
        int c= input.nextInt();
        System.out.println(a*b*c);
    }
}
