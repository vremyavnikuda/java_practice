/*
Сумма цифр натурального числа
Дано натуральное число N. Напишите програму, вычисляющую сумму цифр числа N.

Sample Input:
1234

Sample Output:
10
*/
package while_cycle;
import java.util.Scanner;
public class while10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q = sc.nextInt();
        int w = 0;
        while(q>0){
            w+=q%10;
            q=q/10;
        }
        System.out.print(w);
    }
}
