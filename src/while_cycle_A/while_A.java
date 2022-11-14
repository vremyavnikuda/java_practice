/*
Задача 1
Вводится число натуральное число n. Выведите на экран построчно все числа от 1 до n.

Sample Input 1:
5

Sample Output 1:
1
2
3
4
5

Sample Input 2:
2

Sample Output 2:
1
2
*/
package while_cycle_A;
import java.util.Scanner;
public class while_A {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int q =sc.nextInt();
        int w=0;
        while(q>w){
            w+=1;
            System.out.println(w);
        }
    }
}
