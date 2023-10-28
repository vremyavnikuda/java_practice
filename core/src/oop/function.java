/*
Две функции
Допишите функцию my_first_function, которая выводит на экран три строчки "Hello world!".
Напишите так же функцию my_second_function, которая выведет на экран одну строку: "Java the best!".
Содержание функции main менять запрещено.

Sample Input:

Sample Output:
Hello world!
Hello world!
Hello world!
Java the best!
Java the best!
*/
package oop;
public class function {
    public static void main (String[]args){
        my_first_function();
        my_second_function();
        my_second_function();
    }

    static void my_first_function(){
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
    }
    static void my_second_function(){
        System.out.println("Java the best!");
    }
}
