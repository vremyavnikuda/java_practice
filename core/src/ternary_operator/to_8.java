/*
Слон
Требуется определить, бьет ли слон, стоящий на клетке с указанными координатами (номер строки и номер столбца),
фигуру, стоящую на другой указанной клетке.

Входные данные
Вводятся четыре числа: координаты слон (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке.
Координаты - целые числа в интервале от 1 до 8.

Выходные данные
Требуется вывести слово YES, если слон сможет побить фигуру за 1 ход и NO - в противном случае.

Sample Input 1:
1 1 3 3

Sample Output 1:
YES

Sample Input 2:
1 1 2 3

Sample Output 2:
NO*/
package ternary_operator;
import java.util.Scanner;
public class to_8 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int q=sc.nextInt(),w=sc.nextInt(),e=sc.nextInt(),r=sc.nextInt();
        int q1=Math.abs(q-e);
        int w1=Math.abs(w-r);
        System.out.println((q1==w1)?"YES":"NO");
    }
}
