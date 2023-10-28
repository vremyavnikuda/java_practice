/*Задача 8
Программа запрашивает натуральное число n.
Необходимо составить программу, которая будет считывать целые числа до тех пор,
пока их произведение не станет больше либо равна n.
Выведите через пробел количество введенных чисел и их произведение.

Примечание: подумайте, что произойдёт, если n равно 1.

Sample Input 1:
8
1
5
3
4
2
7
19

Sample Output 1:
3 15

Sample Input 2:
100
-2
-1
5
10
3

Sample Output 2:
4 100
*/
package while_cycle_A;
import java.util.Scanner;
public class while_A_6 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int q = sc.nextInt();
        int w = 0;
        int e = 1;

        while (true){
            int s = sc.nextInt();
            w += 1;
            e *= s;

            if (q <= e){
                break;
            }
        }
        System.out.print(w + " ");
        System.out.print(e);
    }
}
