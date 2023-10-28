/*
Вспомним for
Напишите программу, которая считает натуральное число n,
а затем выведет на экран построчно все числа от 1 до n включительно.

Sample Input:
3

Sample Output:
1
2
3
*/
package list;
import java.util.Scanner;
public class l {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int q= sc.nextInt();
        for (int i=1;i<=q;i++){
            System.out.println(i);
        }
    }
}
