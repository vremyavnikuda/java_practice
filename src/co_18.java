/*Точка 1
Вводятся два действительных числа: координаты точки на плоскости.
Определите, принадлежит ли эта точка закрашенной области. Выведите ответ на задачу в формате "Yes"/"No".

Примечание: границы не являются частью закрашенной области.
y=2*x

Sample Input 1:
1
3

Sample Output 1:
Yes

Sample Input 2:
2.5
-1

Sample Output 2:
No
*/

import java.util.Scanner;

public class co_18 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        double x=sc.nextDouble(),y=sc.nextDouble();
        if(x>=0&&y>0) { // 1ая четверть выполнена
            if (y / x > 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
                return;
            }
        }
        if (x<0&&y>=0){// 2я четверть выполнена
            System.out.println("Yes");
            return;
        }
        if (x<0&&y<0){// 3я четверть выполнена
            if (y/x<2){
                System.out.println("Yes");
                return;
            }
            else{
                System.out.println("No");
                return;
            }
        }
        if (x>=0&&y<=0){// 4я четверть выполнена
            System.out.println("No");
        }
    }
}
