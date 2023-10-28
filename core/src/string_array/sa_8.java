/*
Интересный перевод
Ввод и вывод данных производятся через стандартные потоки ввода-вывода.

На планете Роботов очень не любят десятичную систему счисления, поэтому они попросили
Вас написать программу, которая заменяет все встречающиеся в тексте числа на эти же числа, но в
двоичной системе счисления.

Входные данные
Единственная строка, состоящая из любых символов.
Длина строки не превышает 255 символов. Гарантируется, что во всех числах нет ведущих нулей.

Выходные данные
Выведите преобразованную строку.

Sample Input:
2+4

Sample Output:
10+100
*/
package string_array;
import java.util.Scanner;
public class sa_8 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String numbers=sc.nextLine();
        StringBuilder newString=new StringBuilder("");
        String lastresult="";

        char[] numbers_exit=numbers.toCharArray();
        for (char dChar : numbers_exit){
            if (Character.isDigit(dChar)){
                lastresult+=String.valueOf(dChar);
            }
            else if (lastresult.length()>0){
                newString.append(Integer.toBinaryString(Integer.parseInt(lastresult)));
                newString.append(dChar);
                lastresult="";
            }
            else{newString.append(dChar);}
        }
        if (lastresult.length()>0){
            newString.append(Integer.toBinaryString(Integer.parseInt(lastresult)));
        }
        System.out.println(newString);
    }
}
