/*Количество
Вводится 2 целых числа a и b (a <= b).
Необходимо вычислить количество всех чисел кратных 3, но не кратных 5 от а до b включительно.

Sample Input:
1 16

Sample Output:
4
*/
package while_cycle;
import java.util.Scanner;
public class while3 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int c=0;
        while (a<=b){
            if(a%3==0&&a%5!=0) {
                c++;
            }
            a++;
        }
        System.out.println(c);
    }
}
