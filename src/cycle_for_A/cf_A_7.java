/*Вывод чисел "вниз" Pro
Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c.
Границы включаются.

Входные данные
Заданы три целых числа а, b, с, где a > b

Выходные данные
Выведите единственное число - ответ на задачу.

Sample Input:
20
1
2

Sample Output:
20
18
16
14
12
10
8
6
4
2
*/
package cycle_for_A;
import java.util.Scanner;

public class cf_A_7 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        // принимает от пользователя исходные значения
        //где (а)=отпрвная точка (b)=конечная точка (с)=шаг
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
        //условие (если (i)=(a) и (i)>=(b) ,то тогда из (i) вычесть значение (c))
        for (int i=a;i>=b;i-=c){
            //выводим результат (i)
            System.out.println(i);
        }
    }
}
