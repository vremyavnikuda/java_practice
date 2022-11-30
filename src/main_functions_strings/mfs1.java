/*
Это цифра?
Напишите программу, определяющую, является ли данный символ цифрой или нет.

Входные данные
Задан единственный символ c.

Выходные данные
Необходимо вывести  строку "yes", если символ является цифрой, и строку "no" в противном случае.

Sample Input 1:
8

Sample Output 1:
yes

Sample Input 2:
e

Sample Output 2:
no
*/

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
