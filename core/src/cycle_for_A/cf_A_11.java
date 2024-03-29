/*
Произведение чисел числа
Дано натуральное число. Найдите произведение его цифр.

Входные данные
Задано натуральное число n.

Выходные данные
Выведите ответ на задачу.

Sample Input:
156

Sample Output:
30
*/
package cycle_for_A;
import java.util.Scanner;
public class cf_A_11 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        //вводим число по которому необходимо найти произведение (чисел числа)
        int q =sc.nextInt();
        //переменная куда будем выводить результат
        int sum=1;
        //задаем условие при котором будет выполняться наш цикл
        while(q!=0){
            //выполняем произведение чисел (q)
            sum*=(q%10);
            //получаем остаток чисел по которым необходимо произвести произведение
            q/=10;
        }
        //выводим результат
        System.out.println(sum);
    }
}
