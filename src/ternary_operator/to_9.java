/*Конь
Требуется определить, бьет ли конь, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру,
стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты коня (два числа) и координаты другой фигуры (два числа),
каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES, если конь сможет побить фигуру за 1 ход и NO - в противном случае.

Sample Input 1:
3 4 5 6

Sample Output 1:
NO

Sample Input 2:
7 3 5 4

Sample Output 2:
YES
*/
package ternary_operator;
import java.util.Scanner;
public class to_9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q1 = sc.nextInt(),w1 = sc.nextInt(),q2 = sc.nextInt(),w2 = sc.nextInt();
        int q=Math.abs(q1-q2);
        int w=Math.abs(w1-w2);
        System.out.println(((q==1&&w==2)||(q==2&&w==1))?"YES":"NO");
    }
}
