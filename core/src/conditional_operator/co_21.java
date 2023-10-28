package conditional_operator;/*Точка 4
Вводятся два действительных числа: координаты точки на плоскости.
Определите, принадлежит ли эта точка закрашенной области.
Выведите ответ на задачу в формате "Yes"/"No".

Примечание: границы не являются частью закрашенной области.
y^2+x^2=5
y=x^2-3

Sample Input 1:
1
1

Sample Output 1:
No

Sample Input 2:
2
-0.1

Sample Output 2:
Yes
*/
import java.util.Scanner;

public class co_21 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double x= sc.nextDouble(),y= sc.nextDouble();
        System.out.println((y*y+x*x<5)&&((x*x-3)>y)?"Yes":"No");
    }
}
