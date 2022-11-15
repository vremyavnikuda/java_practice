/*
Повторение 1
Пользователь вводит с клавиатуры натуральное число n.
Затем вводит n целых чисел. Необходимо найти и вывести на экран их сумму.

Sample Input:
3
7
2
9

Sample Output:
18
*/
package cycle_for;
import java.util.Scanner;
public class cf {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int q_sum=0;
        for(int i=0;i<q;i++) {
            int x = sc.nextInt();
            q_sum += x;
        }
        System.out.print(q_sum);
    }
}
