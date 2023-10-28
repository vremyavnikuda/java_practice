/*
Факториал
Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n

n! = 1∙2∙3∙…∙ n.

Sample Input:
5

Sample Output:
120
*/
package cycle_for;
import java.math.BigInteger;
import java.util.Scanner;

public class cf6 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int q = sc.nextInt();
        int q1=1;
        //BigInteger q1 = BigInteger.ONE;
        for (int i =1;i<=q;i++) {//зацикливаем до q==
            //System.out.print(q1.multiply(BigInteger.valueOf(i)));
            q1=q1*i;//факториал(ну условно)
        }
        System.out.println(q1);
    }
}
