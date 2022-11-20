/*
Сумма 2
Вводится массив (сначала количество элементов, потом сами элементы).
Найдите сумму его элементов с чётными индексами и выведите её.
А потом выведите числа, которые суммировались.

Sample Input:
4
1
2
3
4

Sample Output:
4
1
3
*/
package Arrays;
import java.util.Scanner;
public class ar_4 {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        //указываем длинну массива
        int long_arrays= in.nextInt();
        //инициализируем массив
        int[]arrays=new int[long_arrays];
        //создаем переменную которая будет хранить общую сумму
        int arrays_sum=0;
        //создаем условие при котором будет заполняться массив
        for(int i=0;i<arrays.length;i++)
        {   //добавляем элементы в массив определенной длинной==long_arrays
            arrays[i] = in.nextInt();
            //фильтруем только четные индексы элементов массива
            if (i%2==0)
            {
                //и суммируем их
                arrays_sum += arrays[i];
            }
        }
        //выводим сумму четных индексов массива
        System.out.println(arrays_sum);
        //задаем условие
        //выводить только элементы под четными индексами массива
        for (int i=0;i<arrays.length;i++){
            //задаем условие по которому будем фильтровать четные индексы массива
            if (i%2==0)
            //выводим полученный результат
            System.out.println(arrays[i]);
        }
    }
}
