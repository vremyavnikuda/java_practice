/*Точка 6
Вводятся два действительных числа: координаты точки на плоскости.
Определите, принадлежит ли эта точка закрашенной области.
Выведите ответ на задачу в формате "Yes"/"No".

Примечание: границы не являются частью закрашенной области.

y=0.5*x-1
y^2+x^2=5
y=x^2-3

Sample Input 1:
1
1

Sample Output 1:
No

Sample Input 2:
2
0.2

Sample Output 2:
Yes
*/
import java.util.Scanner;

public class co_23 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble(),y=sc.nextDouble();
        if ((y>0.5*x-1)&&(y<x*x-3)&&(y*y<5-x*x)||(-2>y&&y>-3&&-1<x&&x<1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
