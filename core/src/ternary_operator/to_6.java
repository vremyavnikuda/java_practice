/*Координатные четверти
Даны координаты двух точек на плоскости, требуется определить, лежат ли они в одной координатной четверти или нет (все координаты отличны от нуля).

Входные данные
Вводятся 4 числа: координаты первой точки (x1, y1) и координаты второй точки (x2, y2).

Выходные данные
Программа должна вывести слово YES, если точки находятся в одной координатной четверти, в противном случае вывести слово NO.


Sample Input 1:
1 1 2 2

Sample Output 1:
YES

Sample Input 2:
-1 3 4 -5

Sample Output 2:
NO
*/

package ternary_operator;
import java.util.Scanner;
public class to_6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt(),x2=sc.nextInt(),y1=sc.nextInt(),y2=sc.nextInt();
        System.out.println((x1 * y1 > 0 && x2 * y2 > 0)?"YES":"NO");
    }
}
