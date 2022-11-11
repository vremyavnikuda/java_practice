/*
Сумма
Вводится 2 целых числа a и b (a <= b).
Необходимо вычислить сумму всех чисел от а до b включительно.

Sample Input:
1
3

Sample Output:
6
*/
package while_cycle;
import java.util.Scanner;
public class while2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt(),b =sc.nextInt();
        int c=a++;
        while(a<=b){
            //c=a+b;a++;
            c+=a++;
        }
        System.out.println(c);
    }
}
