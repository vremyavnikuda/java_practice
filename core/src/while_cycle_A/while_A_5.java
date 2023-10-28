/*Задача 7
Программа запрашивает два числа: n и x.
Необходимо составить программу, которая будет прибавлять число x само к себе до тех пор, пока сумма не станет
больше либо равна n.
Выведите полученную сумму.

Sample Input 1:
8
3

Sample Output 1:
9

Sample Input 2:
100
5

Sample Output 2:
100
*/
package while_cycle_A;
import java.util.Scanner;
public class while_A_5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        int q=x;
        while (n>q){
            q=q+x;
        }
        System.out.print(q);
    }
}
