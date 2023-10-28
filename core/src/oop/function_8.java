/*
Сортировка по длине строки
Напишите функцию sortByLength,  которая принимает как аргумент строку и сортирует её по длине слова.
Если длины слов одинаковы, то сортировать в алфавитном порядке. Содержание функции main менять запрещено.

Sample Input:
cad aba q we qwert

Sample Output:
q we aba cad qwert
*/
package oop;

import java.util.*;

public class function_8 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sortByLength(s);
    }

    static void sortByLength(String s) {
        String[]arrays=s.toLowerCase(Locale.ROOT).split(" ");
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,arrays);
        Collections.sort(list);
        list.sort(Comparator.comparing(String::length));

        for (String q:list)
            System.out.print(q+" ");
    }
}
