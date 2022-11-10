/*Котлеты
На сковородку одновременно можно положить k котлет.
Каждую котлету нужно с каждой стороны обжаривать m минут непрерывно.
За какое наименьшее время удастся поджарить с обеих сторон n котлет?

Входные данные
Вводятся 3 числа: k, m и n. Все числа не превосходят 32000.

Выходные данные
Вывести время, за которое все котлеты будут обжарены.

Sample Input 1:
1
5
1

Sample Output 1:
10

Sample Input 2:
2
4
3

Sample Output 2:
12
*/
package ternary_operator;
import java.util.Scanner;
public class to_12 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int k = sc.nextInt(),m = sc.nextInt(),n = sc.nextInt();
        int k_m_n = (n/k)*(2*m);
        System.out.println(n<=k?(m*2):n*2%k==0?(n*2/k*m):(n*2/k*m+m));
    }
}

