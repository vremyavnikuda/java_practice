/*
Строки
Дана строка.

Сначала выведите третий символ этой строки.

Во второй строке выведите предпоследний символ этой строки.

В третьей строке выведите первые пять символов этой строки.

В четвертой строке выведите всю строку, кроме последних двух символов.

На пятой строке выведите всю строку, кроме первых 3 символов.

На шестой строке выведите длину данной строки.

Гарантируется, что вводится строчке, состоящая не менее, чем из 5 символов.

Sample Input:
ABCDEFGHI

Sample Output:
C
H
ABCDE
ABCDEFG
DEFGHI
9
*/
package main_functions_strings;
import java.util.Scanner;

public class mfs2 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        //Сначала выведите третий символ этой строки.
        System.out.println(str.charAt(3-1));

        //Во второй строке выведите предпоследний символ этой строки.
        int q=str.length()-2;
        System.out.println(str.charAt(q));

        //В третьей строке выведите первые пять символов этой строки.
        System.out.println(str.substring(0,5));

        //В четвертой строке выведите всю строку, кроме последних двух символов.
        System.out.println(str.substring(0,str.length()-2));

        //На пятой строке выведите всю строку, кроме первых 3 символов.
        System.out.println(str.substring(3));

        //На шестой строке выведите длину данной строки.
        System.out.println(str.length());
    }
}
