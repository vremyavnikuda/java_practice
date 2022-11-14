/*
Второй максимум
Последовательность состоит из различных натуральных чисел и завершается числом 0.
Определите значение второго по величине элемента в этой последовательности.

Числа, следующие за числом 0, считывать не нужно.

Входные данные
Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит).
Гарантируется, что будет введено хотя бы 2 числа.

Выходные данные
Выведите ответ на задачу.

Sample Input:
2 3 4 5 8 7 4 0

Sample Output:
7
*/
package while_cycle;
import java.util.Scanner;
public class while12 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int q1 = q;
        int w = 0;
        while (q != 0) {
            q = sc.nextInt();
            if (q > q1) {
                w = q1;
                q1 = q;
            }
            if (q > w & q < q1) {
                w = q;
            }
        }
        System.out.println(w);
    }
}
