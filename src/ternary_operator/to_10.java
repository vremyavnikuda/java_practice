/*
Ферзь
Требуется определить, бьет ли ферзь, стоящий на клетке с указанными координатами (номер строки и номер столбца),
фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты ферзь (два числа) и координаты другой фигуры (два числа),
каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES, если слон сможет побить фигуру за 1 ход и NO - в противном случае.

Sample Input 1:
1 1 3 3

Sample Output 1:
YES

Sample Input 2:
1 1 2 3

Sample Output 2:
NO
*/
package ternary_operator;
import java.util.Scanner;
public class to_10 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int q1=sc.nextInt(),w1=sc.nextInt(),q2=sc.nextInt(),w2=sc.nextInt();
        int q=Math.abs(q1-q2);
        int w=Math.abs(w1-w2);
        System.out.print(Math.abs(q1-q2)==Math.abs(w1-w2)||q1==q2||w1==w2?"YES":"NO");
    }
}
