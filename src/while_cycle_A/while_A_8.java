/*Задача 10
Вводятся натуральное число n. Выведите на экран пирамидку, состоящую из n слоёв.

Sample Input 1:
5

Sample Output 1:
    *
   ***
  *****
 *******
*********

Sample Input 2:
3

Sample Output 2:
  *
 ***
 */
package while_cycle_A;
import java.util.Scanner;
public class while_A_8 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int a = r.nextInt();
        String str = "*";
        String stm = " ";
        int b = 1;
        int c = a - 1;
        while(b <= a) {
            System.out.println(stm.repeat(c) + str);
            c--;
            b++;
            str += "**";
        }
    }
}
