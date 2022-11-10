/*
Гипотенуза
Вводится два целых числа - длины катетов прямоугольного треугольника. Найдите гипотенузу этого треугольника. Если вы не знаете, как это сделать, то вот вам полезная ссылка

Sample Input 1:
3 4

Sample Output 1:
5.0

Sample Input 2:
5 12

Sample Output 2:
13.0
*/
package ternary_operator;
import java.util.Scanner;
public class to_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double q=sc.nextDouble(),w=sc.nextDouble();
        System.out.println(Math.hypot(q,w));
    }
}
