/*Двоичная запись
Дано натуральное число N. Выведите его представление в двоичном виде в обратном порядке.
Sample Input:
6

Sample Output:
011
*/
package cycle_for;
import java.util.Scanner;
public class cf9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int q = sc.nextInt();
        String q1 = Integer.toBinaryString(q);
        StringBuilder builder_q = new StringBuilder(q1);
        q1= String.valueOf(Integer.parseInt(builder_q.reverse().toString()));
        System.out.println(q1);*/
        StringBuilder result=new StringBuilder();
        int q= sc.nextInt();
        while(q>0){
            if (q%2==0) result.append("0");
            else result.append("1");
            q=q/2;
        }
        System.out.println(result);
    }
}

