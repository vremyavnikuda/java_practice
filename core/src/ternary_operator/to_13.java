/*Упорядочить три числа
Дано три числа, записанный в отдельных строках. Упорядочите их в порядке неубывания.
Программа должна считывать три числа a, b, c, затем программа должна менять их значения так,
чтобы стали выполнены условия a <= b <= c, затем программа выводит тройку a, b, c.

Входные данные
Вводятся три числа, каждое записано в отдельной строке.

Выходные данные
Выведите ответ на задачу.

Sample Input 1:
2
6
-4

Sample Output 1:
-4 2 6

Sample Input 2:
2
3
4

Sample Output 2:
2 3 4*/

package ternary_operator;

import java.util.Scanner;

public class to_13 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int max=Math.max(Math.max(a,b),c);
        int min=Math.min(Math.min(a,b),c);
        int mid = a + b + c - (min + max);
        System.out.println(min+" "+mid+" "+max);
    }
}
