/*Задача 4
Вводятся два целых числа k (1 <= k <= 10) и n (0 <= n <= 100).
Выведите на экран построчно все числа кратные k от 1 до n включительно.

Sample Input 1:
4
27

Sample Output 1:
4
8
12
16
20
24

Sample Input 2:
7
17

Sample Output 2:
7
14
*/
package while_cycle_A;
import java.util.Scanner;
public class while_A_2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),n= sc.nextInt();
        int q=1;
        while(q<=n){
            if (q%k==0)
                System.out.println(q);
            q++;
        }
    }
}
