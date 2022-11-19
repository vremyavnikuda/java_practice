/*Исправьте Код!
Вася заказал посылку из интернет магазина в постамат.
Через некоторое время ему пришло сообщение с пинкодом, который, в том числе, может начинаться с 0.
Постамат даёт пользователю 5 попыток ввода пинкода, если пользователь вводит неправильный пинкод, то система отправляет СМС с новым пинкодом.
Определите, сможет ли Вася забрать свою посылку?
На вход программе даются строки попарно: пароль, который пришёл Васе и пароль, который он ввёл.
Если Вася вводит неверный пароль, то на экран выводится "INCORRECT n" (где n - номер попытки), а
 если правильный, то "CORRECT". Если Вася исчерпал все попытки, то появляется строка "Error".

Для решения этой задачи программист написал следующий код:

import java.util.Scanner;
class A{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        boolean pin_code_coincided = true;
        while (true){
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            counter++;
            if(correct.equals(vasya)){
                System.out.println("СORRECT");
                break;
            }
            System.out.println("INCORRECT" + counter);
        }
        if (!pin_code_coincided){
            System.out.println("Error");
        }else{
            System.out.println("CORRECT");
        }
    }
}

Найдите ошибки в программе и решите задачу.

Sample Input 1:
1234
1235
3478
1234
5623
5623

Sample Output 1:
INCORRECT 1
INCORRECT 2
CORRECT

Sample Input 2:
1234
1235
3478
1234
5623
5624
0534
5623
4512
3214

Sample Output 2:
INCORRECT 1
INCORRECT 2
INCORRECT 3
INCORRECT 4
INCORRECT 5
Error
*/
package cycle_B;
import java.util.Scanner;
public class cf_B_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        //boolean pin_code_coincided = true;
        while (true) {
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            counter++;
            if (correct.equals(vasya)) {
                System.out.println("CORRECT");
                break;
            }
            //    System.out.println("INCORRECT" + counter);

            if (counter == 5) {
                System.out.println("INCORRECT " + counter);
                System.out.println("Error");
                break;
            }else{
                System.out.println("INCORRECT " + counter);
            }
        }
    }
}
