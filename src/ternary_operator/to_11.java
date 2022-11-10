/*
Коровы
По данному числу n закончите фразу "На лугу пасется..."
одним из возможных продолжений: "n коров", "n корова", "n коровы",
правильно склоняя слово "корова".

Входные данные
Дано число n (n<100).

Выходные данные
Программа должна вывести введенное число n и одно из слов: коров, корова или коровы, например, 1 корова, 2 коровы, 5 коров.
Между числом и словом должен стоять ровно один пробел.

Sample Input 1:
3

Sample Output 1:
3 коровы

Sample Input 2:
10

Sample Output 2:
10 коров
*/
package ternary_operator;
import java.util.Scanner;
public class to_11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q = sc.nextInt();
        if (q<100){
            if (q%10==1&&q!=11){
                System.out.println(q+" корова");
            } else if ((q%10>=2)&&(q%10<=4)&&(q/10!=1)) {
                System.out.println(q+" коровы");
            }
            else{
                System.out.println(q+" коров");
            }
        }
        else {
            System.out.println("Число больше 100");
        }
    }
}
