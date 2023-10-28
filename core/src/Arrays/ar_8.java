/*
Переставить соседние
Переставьте соседние элементы списка (A[0] c A[1], A[2] c A[3] и т.д.).
Если элементов нечетное число, то последний элемент остается на своем месте.

Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.

Выходные данные
Выведите ответ на задачу.

Sample Input:
6
4
5
3
4
2
3

Sample Output:
5
4
4
3
3
2
*/
package Arrays;
import java.util.Scanner;
public class ar_8 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int q= in.nextInt();
        int c =0;

        for (int i=0;i<(q%2==0 ? q : q -1);i+=2){
            int x=in.nextInt(),y= in.nextInt();
            System.out.println(y+"\n"+x);
        }

        if (q%2!=0){
            System.out.println(in.nextInt());
        }
    }
}
