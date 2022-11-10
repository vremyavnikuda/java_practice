/*Тот же кофе
Решите первую задачу из этого урока, используя тернарный оператор.

Условие:

Вася приехал в Америку и он оооооочень любит кофе.
В Америке приобрести этот напиток можно лишь лицам достигшим  возраста 21 год.
Напишите программу, которая считает возраст Васи и выведет ответ ("Да"/"Нет") на вопрос: попьёт ли Вася сегодня кофе?

Sample Input 1:

18
Sample Output 1:

Нет
Sample Input 2:

34
Sample Output 2:

Да*/
package ternary_operator;
import java.util.Scanner;
public class to_3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q =sc.nextInt();
        System.out.println((q>=21)? "Да":"Нет");
    }
}
