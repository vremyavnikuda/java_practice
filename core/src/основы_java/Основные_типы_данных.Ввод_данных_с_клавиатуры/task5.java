package основы_java.Основные_типы_данных.Ввод_данных_с_клавиатуры;

import java.util.Scanner;
/*
Следующее четное
Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы.

Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у чётных и у нечётных чисел.

Sample Input 1:
5

Sample Output 1:
6

Sample Input 2:
8

Sample Output 2:
10
*/
public class task5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n+(n%2 ==0 ? 2:0));
    }
}
