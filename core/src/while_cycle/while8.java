/*
Сумма квадратов
По данному натуральному n вычислите сумму 12+22+...+n2.

Sample Input:
3

Sample Output:
14
*/
package while_cycle;
import java.util.Scanner;
public class while8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int w=1;
        int e=0;
        while(w<=q){
            e+=w*w;
            w++;
        }
        System.out.print(e);
    }
}
