/*
Вывод чисел "вниз"
Напишите программу, которая выводит в столбик целые числа от 50 до 0  с шагом 10.

Sample Input:
Sample Output:
50
40
30
20
10
0
*/
package cycle_for_A;
public class cf_A_6 {
    public static void main (String[]args){
        //задаем условие если i==50 ; i>== 0;тогда i-10(каждый шаг
        //до тех пор пока i не станет ==0
        for (int i=50;i>=0;i-=10){
            //выводим результат (i)
            System.out.println(i);
        }
    }
}
