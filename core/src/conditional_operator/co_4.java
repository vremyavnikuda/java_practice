package conditional_operator;/*Деление
Напишите программу, которая считывает 2 действительных числа и выводит их частное. Если это невозможно, то выводит слово "Error"

Sample Input:

10 2
Sample Output:

5.0*/

import java.util.Scanner;

public class co_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double q = sc.nextDouble();
        double w = sc.nextDouble();

        if (w == 0) {
            System.out.println("Error");
        } else {
            System.out.println(q / w);
        }
    }
}