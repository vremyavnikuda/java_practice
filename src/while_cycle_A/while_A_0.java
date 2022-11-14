/*
Задача 2
Вводятся два целых числа a и b (a <= b).
Выведите на экран все числа от a до b включительно.

Sample Input 1:
3
7

Sample Output 1:
3
4
5
6
7

Sample Input 2:
-2
1

Sample Output 2:
-2
-1
0
1
*/
package while_cycle_A;
import java.util.Scanner;
public class while_A_0 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int q =sc.nextInt(),w =sc.nextInt();
        while (q<=w){
            System.out.println(q);
            q++;
        }
    }
}
