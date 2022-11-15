/*
Повторение 2
Пользователь вводит с клавиатуры натуральное число n.
Затем вводит n целых чисел.
Необходимо найти и вывести на экран количество чётных.

Sample Input:
3
7
2
9

Sample Output:
1
*/
package cycle_for;
import java.util.Scanner;
public class cf1 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int q =sc.nextInt();//// сканирование числа q
        int q1=0;//Количество четных чисел
        for (int i = 0; i<q; i++){//  до тех пор пока i<q
            int x= sc.nextInt();// сканируй x
            if(x%2==0){// если при делении c остатком x =0 выведи x
                q1++;//и увеличь счетчик на +1
            }
        }
        System.out.println(q1);//выведи счетчик
    }
}
