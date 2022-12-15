package oop;

public class test_0 {
    //точка входа в программу
    //основной блок ,где указываются методы
    public static void main (String args[]){
        //один раз вызываем метод hello()
        hello();
        //2 раза вызываем метод welcome()
        welcome();
        welcome();
    }

    static void hello(){
        System.out.println("Hello");
    }

    static void welcome(){
        System.out.println("Welcome to Java");
    }
}
