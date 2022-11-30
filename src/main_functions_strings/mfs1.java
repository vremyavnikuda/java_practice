package main_functions_strings;

import java.util.Scanner;

public class mfs1 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);

        String q=sc.nextLine();
        char c=q.charAt(0);
        // для этого необходимо воспользоваться методом класса Character
        //isDigit -метод проверяет ,является ли chr цифрой ?
        if (Character.isDigit(c)){
            System.out.println("yes");//если да
        }else {
            System.out.println("no");//если нет
        }
    }
}
