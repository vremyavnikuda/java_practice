/*
Геометрическая прогрессия
По данному целому числу a и натуральному n вычислите сумму 1+a+a2+...+an,
не используя формулу суммы геометрической прогрессии.
Время работы программы должно быть пропорционально n.

Входные данные
Вводятся 2 числа - a и n.

Выходные данные
Необходимо вывести  значение суммы.

Sample Input:
2
2

Sample Output:
7
*/
package cycle_for;

import java.util.Scanner;

public class cf8 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt(),n = sc.nextInt();
        int gP=1;
        for(int i =1;i<=n;i++){
            gP=gP+(int)Math.pow(a,i);
        }
        System.out.println(gP);
    }
}
