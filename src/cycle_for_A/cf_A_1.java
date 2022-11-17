/*
Сумма квадратов
Напишите программу, которая находит сумму квадратов натуральных чисел от 1 до n,
где n вводится с клавиатуры.

Входные данные
Задано натуральное число n

Выходные данные
Выведите единственное число - ответ на задачу.

Sample Input 1:
5

Sample Output 1:
55

Sample Input 2:
1

Sample Output 2:
1
*/
package cycle_for_A;

import java.util.Scanner;

public class cf_A_1 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        //переменная (число) до которого необходимо найти сумму квадратов натурального числа от 1 до q
        //включительно
        int q = sc.nextInt();
        //переменная куда будем складывать сумму квадратов
        int q_sum2=0;
        //условие
        for(int i=0;i<=q;i++){
            //нахождение суммы квадратов числа от 1 до q(включительно) и занесение результата в q_sum
            q_sum2+=i*i;
        }
        //вывод результата
        System.out.println(q_sum2);
    }
}
