/*
Произведение
Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП" (гарантируется, что других слов не будет).
Найдите произведение ненулевых чисел. Если же такое произведение найти не удалось, то выведите на экран "Не найдено".

Для того, чтобы превратить String в другой тип данных используйте конструкцию подобную этой:


String s = "45";
int n = Integer.parseInt(s); //в переменной n окажется число 45

Sample Input:
3
0
2
4
СТОП

Sample Output:
24
*/
package cycle_for;

import java.util.Scanner;

public class cf7 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        String q ;
        boolean flag=false;
        int q2=1;
        for (q=sc.next();!q.equals("СТОП");q=sc.next()){
            int q1=Integer.parseInt(q);
            if (q1!=0){
                q2*=q1;
                flag=true;
            }
        }
        System.out.println(flag?q2: "Не найдено");
    }
}
