/*
Таблица умножения
Напишите программу, которая по заданному с клавиатуры числу n печатает таблицу умножения от 1 до 9.

Входные данные
Задано натуральное число n.

Выходные данные
Выведите ответ на задачу.

Sample Input 1:
2

Sample Output 1:
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18

Sample Input 2:
8

Sample Output 2:
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72
*/
package cycle_for_A;
import java.util.Scanner;

public class cf_A_9 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        //получаем исходное число по которому нужно составить умножение
        int q =sc.nextInt();
        //переменная для суммирования результата
        int summ=0;
        //условие
        for (int i =1;i<=9;i++){
            //суммируем результат
            summ=q*i;
            //выводим результат
            System.out.println(q+" * "+i+" = "+summ);
        }
    }
}
