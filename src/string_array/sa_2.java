/*
Кого больше?
Вводится строка, определите, каких символов в ней больше: цифр или букв?
Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим.
Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter".
Если же их равное количество, то выведите слово "Equal".

Sample Input:
34Hi56

Sample Output:
Digit
*/
package string_array;
import java.util.Scanner;
public class sa_2 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String next= sc.nextLine();
        //счетчики
        int letters=0;
        int numbers=0;
        //преобразуем строку в массив символов
        char[]arrays=next.toCharArray();
        //задаем условие сравнения
        for (int i=0;i<next.length();i++){
            //ищем в символах буквы +letters
            if (Character.isLetter(arrays[i])){
                letters++;
            }
            //ищем в символах цифры +numbers
            if (Character.isDigit(arrays[i])){
                numbers++;
            }
        }
        //задаем условие сравнения полученных значений счетчиков
        if (letters>numbers){
            System.out.println("Letter");//букв больше чем цифр
        }
        if (letters<numbers){
            System.out.println("Digit");//цифр больше чем букв
        }
        if (letters==numbers){
            System.out.println("Equal");//цифры==буквы
        }
    }
}
