/*
Король
Требуется определить, бьет ли король, стоящий на клетке с указанными координатами (номер строки и номер столбца),
фигуру, стоящую на другой указанной клетке. Напишите функцию king_step, которая принимает 4 целых числа  - сначала
координаты клетки, в которой стоит король, а потом координаты клетки, в которой стоит фигура, которую он хочет побить.
Ваша функция должна вывести на экран:

1, если координаты короля некорректны;
2, если координаты фигуры некорректны;
3, если координаты совпадают;
"YES"/"NO" - ответ на задачу, если всё в порядке.


Sample Input 1:
2
3
2
4

Sample Output 1:
YES

Sample Input 2:
2
1
2
4

Sample Output 2:
NO

Sample Input 3:
-1
3
2
4

Sample Output 3:
1

Sample Input 4:
2
3
12
4

Sample Output 4:
2

Sample Input 5:
1
3
1
3

Sample Output 5:
3
*/
package oop.recursion;

import java.util.Scanner;

public class return_8 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();
        king_step(x1,y1,x2,y2);
    }
    /*
    1, если координаты короля некорректны;
    2, если координаты фигуры некорректны;
    3, если координаты совпадают;
    "YES"/"NO" - ответ на задачу, если всё в порядке.
    */
    public static void king_step(int x1, int y1, int x2, int y2) {
        // Проверяем, находятся ли координаты короля вне пределов шахматной доски (1-8 для x и y).
        if (x1 < 1 || x1 > 8 || y1 < 1 || y1 > 8) {
            System.out.println("1");
            return;
        }

        // Проверяем, находятся ли координаты фигуры вне пределов шахматной доски (1-8 для x и y).
        if (x2 < 1 || x2 > 8 || y2 < 1 || y2 > 8) {
            System.out.println("2");
            return;
        }

        // Проверяем, совпадают ли координаты короля и фигуры.
        if (x1 == x2 && y1 == y2) {
            System.out.println("3");
            return;
        }

        // Проверяем, может ли король атаковать фигуру, проверяя, разницу между x и y координатами не превышает 1.
        if (Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
