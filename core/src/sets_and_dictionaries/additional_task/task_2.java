/*
Сколько корней?
С клавиатуры вводится 3 числа: a, b, c - коэффициенты квадратного уравнения
a*x2 + b*x + c = 0 (a != 0).  Определите, сколько корней будет у этого уравнения.
Выведите на экран одно число - количество корней уравнения.

Sample Input:
1
-5
6

Sample Output:
2
*/
package sets_and_dictionaries.additional_task;
import java.util.Scanner;
public class task_2 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt(),b= sc.nextInt(),c= sc.nextInt();
        int d=(b*b)-4*a*c;
        if (d==0){
            System.out.println("1");
        }
        else if (d>0){
            System.out.println("2");
        }
        else{
            System.out.println("нет корней");
        }
    }
}
