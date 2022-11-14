/*
Задача 9
Вводятся натуральное число n.
Выведите на экран лесенку, состоящую из n ступенек. Каждая i-ая ступенька состоит из i звёздочек.

Sample Input 1:
5

Sample Output 1:
*
**
***
****
*****

Sample Input 2:
3

Sample Output 2:
*
**
***
*/
package while_cycle_A;
import java.util.Scanner;
public class while_A_7 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int q =sc.nextInt();
        int i =0;
        while (i<=q){
            System.out.println("*".repeat(i));
            i++;
        }
    }
}
