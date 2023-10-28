package conditional_operator;/*
Уравнение 2
Вводятся три целых числа:  a, b и c - коэффициенты квадратного уравнения (a != 0).
Определите количество его корней.
Вам достаточно вывести одно целое число - количество корней квадратного уравнения.

Sample Input 1:
1
-5
6

Sample Output 1:
2

Sample Input 2:
1
2
1

Sample Output 2:
1
*/

import java.util.Scanner;

public class co_16 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt(),b =sc.nextInt(),c =sc.nextInt();
        double q =((Math.pow(b,2))-(4*(a*c)));
        if (q<0){
            System.out.println("0");
        } else if (q==0) {
            System.out.println("1");
        }else{
            System.out.println("2");
        }
    }
}
