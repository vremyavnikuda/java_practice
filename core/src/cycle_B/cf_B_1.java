/*
В обратном порядке через одного
Вводятся два целых числа: a и b (a <=b ). Выведите на экран все числа от b до а через одно на разных строчках.

Sample Input:
3 11

Sample Output:
11
9
7
5
3
*/
package cycle_B;
import java.util.Scanner;
public class cf_B_1 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        //указываем диапазон чисел для программы
        int q = sc.nextInt(), w = sc.nextInt();
        //условие(если (i)==(w) и (w)>=(q) то от (w) -=2)
        for (int i=w;w>=q;w-=2){
            //вывести результат
            System.out.println(w);
        }
    }
}
