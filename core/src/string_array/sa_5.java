/*
Самое длинное слово
Вводится единственная строка без знаков препинания. Определите длину самого длинного слова в ней.

Sample Input:
Это самое длинное слово здесь

Sample Output:
7
*/
package string_array;
import java.util.Scanner;
public class sa_5 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //получаем строку в которой нужно найти самое длинное слово
        String text= sc.nextLine().replaceAll(",","");
        //инициализируем массив (String) и сплитуем его на слова
        String[]text_array=text.split(" ");
        //создаем переменную length_text с пустым значением
        String length_text="";
        //через цикл сравниваем каждое слово с словом в length_text
        //если оно длиннее (заменяем его) если нет (оставляем как есть)
        for (int i=0;i<text_array.length;i++){
            if (text_array[i].length() >= length_text.length()) {
                length_text = text_array[i];
            }
        }
        //выводим полученный результат с корректировкой на length(длину строки)
        System.out.println(length_text.length());
    }
}
