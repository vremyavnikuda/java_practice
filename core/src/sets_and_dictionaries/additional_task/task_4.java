/*
Сумма чисел, заканчивающихся на 7 или 3
С клавиатуры вводятся 2 числа: a и b соответственно.
 Необходимо найти сумму всех чисел от a до  b включительно, заканчивающихся на 3 или 7.

Sample Input:
10
30

Sample Output:
80
*/
package sets_and_dictionaries.additional_task;
import java.util.Scanner;
public class task_4 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b= sc.nextInt();
        int summa=0;
        for (int i=a;i<=b;i++) {
            if (i%10==3||i%10==7){
                summa+=i;
            }
        }
        System.out.println(summa);
    }
}
