/*
Сколько элементов, равных максимуму?
Последовательность состоит из натуральных чисел и завершается числом 0.
Всего вводится не более 10000 чисел (не считая завершающего числа 0).
Определите, сколько элементов этой последовательности равны ее наибольшему элементу.

Числа, следующие за числом 0, считывать не нужно.

Sample Input:
1
2
4
5
2
5
3
0

Sample Output:
2
*/
package cycle_for;

import java.util.Scanner;

public class cf11 {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        //кол-во чисел == максимальному значению
        int qmax=0,q1=0;

        //условие
        for (int q =sc.nextInt();q!=0;q= sc.nextInt()){
            //находим самый большой элемент
            if (qmax<q){
                qmax=q;
                //данная переменная нужна ,для того что бы начать подсчет
                //заного с 0
                q1=0;
            }
            //если максимальное значение == введенному
            if (qmax==q){
                //++ к счетчику
                ++q1;
            }
        }
        System.out.println(q1);
    }
}