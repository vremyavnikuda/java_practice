package conditional_operator;/*Точка 3
Вводятся два действительных числа: координаты точки на плоскости.
Определите, принадлежит ли эта точка закрашенной области.
Выведите ответ на задачу в формате "Yes"/"No".

Примечание: границы не являются частью закрашенной области.
y=x^2-2*x-3
y=x/2

Sample Input 1:
1
1

Sample Output 1:
No

Sample Input 2:
1
-2.1

Sample Output 2:
Yes
*/
import java.util.Scanner;

public class co_20 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double x =sc.nextDouble(),y =sc.nextDouble();
        System.out.println((x/2>y)&&(x*x-x*2-3<y)?"Yes":"No");
    }
}
