/*
Какое слово длиннее?
Напишите функцию twoWords, которая принимает две строки и сравнивает их длины. После чего выводит на экран либо
"Первая строка длиннее", либо "Вторая строка длиннее", либо "Равная длина". Содержание функции main менять запрещено.

Sample Input:
Привет!
Пока(

Sample Output:
Первая строка длиннее
*/
package oop;

import java.util.Scanner;

public class function_2 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        twoWords(s1,s2);
    }
    //функция сравнения строк
    static void twoWords(String s1,String s2){
        //сравниваем первую строку со второй
        if (s1.length()>s2.length()){
            System.out.println("Первая строка длиннее");
        //сравниваем вторую строку с первой
        } else if (s2.length()>s1.length()) {
            System.out.println("Вторая строка длиннее");
        }
        //если они равны
        else {
            System.out.println("Равная длина");
        }
    }
}
