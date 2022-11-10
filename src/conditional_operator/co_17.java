package conditional_operator;/*
Вводятся три целых числа:  a, b и c - коэффициенты квадратного уравнения.
Определите количество его корней. Вам достаточно вывести одно целое число - количество корней уравнения.
Если корней бесконечно много, ты выведите строку "inf".
*/


import java.util.Scanner;

public class co_17 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        /*double q =((Math.pow(b,2))-(4*(a*c)));
        if(q<0){
            System.out.println("0");
        }else if(q==0){
            System.out.println("1");
        } else if (q>0){
            System.out.println("2");
        }else {
            System.out.println("inf");
        }*/
        int d = b * b - 4 * a * c;
        if (a == 0)
        {
            if(b == 0 && c != 0)
            {
                System.out.println("0");
        }
            else if (b == 0 && c == 0)
        {
            System.out.println("inf");
        }
            else
        {
            System.out.println("1");
        }
        }
        else if(d < 0)
        {
            System.out.println("0");
        } else if(d > 0)
        {
            System.out.println("2");
        } else
        {
            System.out.println("1");
        }
    }
}