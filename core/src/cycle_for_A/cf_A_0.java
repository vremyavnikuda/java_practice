/*Сумма чисел
Напишите программу, которая находит сумму натуральных чисел от 1 до n, где n вводится с клавиатуры.

Входные данные
Задано натуральное число n

Выходные данные
Выведите единственное число - ответ на задачу.

Sample Input 1:
10

Sample Output 1:
55

Sample Input 2:
5

Sample Output 2:
15
*/
package cycle_for_A;

import java.util.Scanner;

public class cf_A_0 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        //переменная (число) до которой нужно найти сумму от 1 до q
        int q =sc.nextInt();
        //переменная куда будем суммировать все до введенного число в q
        int q_sum=0;
        //условие
        for (int i=0;i<=q;i++){
            //суммируем каждую итерацию до q числа включительно
            q_sum+=i;
        }
        //выводим результат
        System.out.print(q_sum);
    }
}
