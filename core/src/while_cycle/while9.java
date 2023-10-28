/*Утренняя пробежка
В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.

Входные данные
Программа получает на вход действительные числа x и y

Выходные данные
Программа должна вывести одно натуральное число.

Sample Input:
10
20

Sample Output:
9
*/
package while_cycle;
import java.util.Scanner;
public class while9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextInt(),y=sc.nextInt();
        double q=0;
        int day=1;
        while(x<y){
            q=x*0.1;
            x+=q;
            day++;
        }
        System.out.print(day);
    }
}
