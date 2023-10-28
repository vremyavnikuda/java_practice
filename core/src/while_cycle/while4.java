/*
Считывание чисел с клавиатуры
Пользователь с клавиатуры вводит действительные числа до 0.
Необходимо вычислить их среднее арифметическое.
Гарантируется, что он введёт хотя бы одно ненулевое число.

Sample Input:
1
2
3
0

Sample Output:
2.0
*/
package while_cycle;
import java.util.Scanner;
public class while4 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int q =sc.nextInt();
        int w=0;
        double e=0;
        while(q!=0){
            e++;
            w+=q;
            q=sc.nextInt();
        }
        System.out.print(w/e);
    }
}
