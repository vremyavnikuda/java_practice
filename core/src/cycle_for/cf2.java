/*
Опять Сумма
Вводится 2 целых числа a и b (a <= b).
Необходимо вычислить сумму всех чисел от а до b включительно.

Sample Input:
1
3

Sample Output:
6
*/
package cycle_for;
import java.util.Scanner;
public class cf2 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt(),b=sc.nextInt();//вводим 2 целых числа
        int ab=0;//сумма этих чисел
        for (int i=a;i<=b;i++){/*если i=a и при этом i<=b дабавляем +1
        изменение*/
            ab+=i;//ab изменить на шаг i
        }
        System.out.print(ab);
    }
}
