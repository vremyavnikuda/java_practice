package conditional_operator;/* Шоколадка
Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).

Входные данные
Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.

Выходные данные
Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.

Sample Input 1:
3 2 4

Sample Output 1:
YES

Sample Input 2:
3 2 1

Sample Output 2:
NO
*/


import java.util.Scanner;

public class co_10 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int q= sc.nextInt(),w= sc.nextInt(),e= sc.nextInt();
        if( (q * w > e) && (e<=30000) &&(e % q == 0 || e % w == 0)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
