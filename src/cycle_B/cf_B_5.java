/*
Делители
Вводится натуральное число n. Необходимо определить количество его делителей.

Sample Input:
100

Sample Output:
9
*/
package cycle_B;
import java.util.Scanner;
public class cf_B_5 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //получаем от пользователя число
        int q =sc.nextInt();
        //счетчик (сколько у нас полученно значений)
        int q_sum=0;
        //условие цикла(если i==1 и i<=q ,то i++)
        for (int i=1;i<=q;i++){
            //если остаток при делении q%i==0
            if (q%i==0){
                //прибавить прохождение цикла ++
                q_sum++;
                //продолжить цикл с начала
                continue;
            //если остаток при делении q%i!=0
            } else if (q%i!=0) {
                //не прибавлять прохождение цикла ,а просто продолжить его
                continue;
            }
        }
        //вывести итоговый результат
        System.out.println(q_sum);
    }
}
