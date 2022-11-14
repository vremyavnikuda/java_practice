/*
Количество элементов, больших предыдущего
Последовательность состоит из натуральных чисел и завершается числом 0.
Определите, сколько элементов этой последовательности больше предыдущего элемента.
Гарантируется ввод хотя бы двух ненулевых чисел.
Числа, следующие за числом 0, считывать не нужно.

Sample Input:
8
11
21
0

Sample Output:
2
*/
package while_cycle;
import java.util.Scanner;
public class while11 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int q = sc.nextInt();
        int w=0;
        while (q!=0){
            int e=q;
            q=sc.nextInt();
            if (e<q){
                w++;
            }
        }
        System.out.print(w);
    }
}
