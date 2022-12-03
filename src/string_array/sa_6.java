package string_array;

import java.util.Arrays;
import java.util.Scanner;

public class sa_6 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        //получаем строку от пользователя в которой нужно найти букву которая повторяется больше всего раз
        char[] array_letter = sc.nextLine().toLowerCase().replaceAll(" ", "").toCharArray();
        //сортируем массив
        Arrays.sort(array_letter);
        //счетчики
        //сколько раз повторяется буква
        int count_max = 0;
        int count = 1;
        //какая именно буква
        char letter = ' ';

        //задаем цикл сравнения букв
        for (int i=0;i<array_letter.length;i++){
            for (int j=i+1;j<array_letter.length;j++){
                if (array_letter[i] == array_letter[j]) count++;
            }
            //задаем цикл сравнения счетчик
            if (count>count_max){
                count_max = count;
                letter = array_letter[i];
                count=1;
            }
            else count=1;
        }
        System.out.println(letter + " " + count_max);
    }
}
