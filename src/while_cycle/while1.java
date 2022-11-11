/*
Квадраты
Пользователь вводит натуральное число. Необходимо вывести
все полные квадраты натуральных чисел, не превосходящие этого числа.

Sample Input:
17

Sample Output:
1
4
9
16
*/

package while_cycle;
import java.util.Scanner;
public class while1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q = sc.nextInt();
        int w=1;
        while (w*w<=q){
            System.out.println(w*w);
            w++;
        }
    }
}
