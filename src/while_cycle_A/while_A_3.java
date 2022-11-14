/*
Задача 5
Пользователь вводит натуральные числа по одному на каждой строке.
Когда ему надоедает, то он вводит 0. Найти количество введенных чисел (0 не считается)

Sample Input 1:
8
5
1
4
9
9
0

Sample Output 1:
6

Sample Input 2:
10
2
23
0

Sample Output 2:
3
*/
package while_cycle_A;
import java.util.Scanner;
public class while_A_3 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int q = sc.nextInt();
        int q1=0;
        while(q!=0){
            q= sc.nextInt();
            q1++;
        }
        System.out.println(q1);
    }
}
