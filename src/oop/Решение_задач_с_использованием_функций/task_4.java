/*
Сколько цифр
Дана строка, содержащая цифры и английские буквы (большие и маленькие).
Напишите функцию digit_count, которая найдёт количество цифр в этой строке.

Входные данные
Вводится строка ненулевой длины. Известно также, что длина строки не превышает 1000 знаков.

Выходные данные
Выведите количество цифр, которые присутствуют в строке.

Содержание функции main менять запрещено.

Sample Input:
aifun3eIYFI2bisdb45YFybjyFVUVYFV113

Sample Output:
7
*/
package oop.Решение_задач_с_использованием_функций;
import java.util.Scanner;

public class task_4 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(digit_count(s));
    }
    public static int digit_count (String s){
        //счетчик цифр в сроке
        int count_numbers=0;
        //через цикл foreach приводим строку к массиву символов
        for (char numbers:s.toCharArray()){
            //перебираем массив символов методом Character.isDigit в поиске цифр в строке
            if (Character.isDigit(numbers)){
                //если нашли число (увеличиваем счетчик count_numbers++)
                count_numbers++;
            }
        }
        //возвращаем результат счетчика count_numbers
        return count_numbers;
    }
}
