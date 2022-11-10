/*Линейные уравнения
* Уравнение 1
Вводятся два целых числа:  a, b - коэффициенты линейного уравнения a * x + b = 0. Определите количество его корней. Вам достаточно вывести одно целое число - количество корней квадратного уравнения. Если корней бесконечно много, ты выведите строку "inf".

Sample Input 1:

1
-5
Sample Output 1:

1
Sample Input 2:

0
2
Sample Output 2:

0*/
import java.util.Scanner;

public class co_15 {
    public static  void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(), w = sc.nextInt();
        if (q == 0 && w == 0) {//Если q=0 ,то у уравнения нет корней
            //так как любое помноженное число будет давать 0
            System.out.println("inf");
        } else {//если у q!=0 ,то у уравнения 1 корень (если q=0 and w=0,то корнем уравнения может быть любое число)
            System.out.println(q != 0 ? "1" : "0");
        }
    }
}
