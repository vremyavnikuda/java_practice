/*
Треугольник
Вводятся три целых числа.
Необходимо определить, существует ли треугольник с такими сторонами.
В ответ выведите "Yes"/"No".

Sample Input 1:
3 4 5

Sample Output 1:
Yes

Sample Input 2:
2 2 5

Sample Output 2:
No
*/
package ternary_operator;
import java.util.Scanner;
public class to_5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt(),w=sc.nextInt(),e=sc.nextInt();
        System.out.println((q+w>e)&&(w+e>q)&&(e+q>w)?"Yes":"No");
    }
}
