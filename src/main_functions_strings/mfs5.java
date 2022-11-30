/*
Кто первый?
Дана строка, в которой через пробел перечислены цифры.
На следующей строке вводится цифра.
Определите индексы первого и последнего её вхождения.

Sample Input:
4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
4

Sample Output:
0
28
*/
package main_functions_strings;
import java.util.Scanner;
public class mfs5 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //получаем строку чисел
        String line= sc.nextLine();
        //вводим число которое нужно найти
        String line_search= sc.nextLine();
        //получаем индекс первого вхождения числа
        System.out.println(line.indexOf(line_search));
        //получаем индекс последнего вхождения числа
        System.out.println(line.lastIndexOf(line_search));
    }
}
