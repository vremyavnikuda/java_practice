/*
Повторение на флаги
Вводится количество чисел n, затем n чисел.
Необходимо выяснить есть ли среди них такое, которое заканчивается на 4?
Если такое число имеется среди введённых выведите на экран слово "Yes", иначе "No".

Sample Input:
5
21
32
45
64
98

Sample Output:
Yes
*/
package cycle_B;
import java.util.Scanner;
public class cf_B_2 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        //указываем сколько чисел будет введено
        int q =sc.nextInt();
        //наличие ==fasle
        boolean q1=false;
        //указываем условие при котором изменится значение fasle
        for (int i =0;i<q;i++){
            //зацикливаем ввод числа
            int a =sc.nextInt();
            //если введенное число заканчивается на "4"
            if (a%10==4){
                //то изменить значение переменной q1 на == true
                q1=true;
                //как только значение изменилось (останаливаем цикл)
                break;
            }
        }
        //выводим результат
        //если значение q1==true
        if (q1)
            //Yes
            System.out.println("Yes");
        //если значение q1==false
        else
            //No
            System.out.println("No");
    }
}
