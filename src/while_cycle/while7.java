/*
Минимальный делитель
Дано целое число, не меньшее 2.
Выведите его наименьший натуральный делитель, отличный от 1.

Sample Input:
15

Sample Output:
3
*/
package while_cycle;
import java.util.Scanner;
public class while7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q = sc.nextInt();
        int w=2;
        while(q%w!=0){
            w++;
        }
        System.out.print(w);
    }
}
