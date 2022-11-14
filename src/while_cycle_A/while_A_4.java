/*Задача 6
Пользователь вводит натуральные числа по одному на каждой строке.
Когда ему надоедает, то он вводит 0. Найти сумму введенных чисел (0 не считается)

Sample Input 1:
10
2
5
5
0

Sample Output 1:
22

Sample Input 2:
3
2
1
0

Sample Output 2:
6
*/
package while_cycle_A;
import java.util.Scanner;
public class while_A_4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q =sc.nextInt();
        int q1=0;
        while(q!=0){
            int w=q;
            q=sc.nextInt();
            q1+=w;
        }
        System.out.println(q1);
    }
}
