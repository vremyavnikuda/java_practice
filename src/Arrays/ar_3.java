/*
Сумма
Вводится список (сначала количество элементов, потом сами элементы).
Найдите сумму всех элементов и выведите её. А потом выведите введённые числа в обратном порядке.

Sample Input:
4
1
2
3
4

Sample Output:
10
4
3
2
1
*/
package Arrays;
import java.util.Scanner;
public class ar_3 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        //long_arrays==длинна массива
        int long_arrays= in.nextInt();
        //инициализируем массива с длинной == long_arrays
        int [] arrays=new int[long_arrays];
        //создаем переменную в которой будем хранить сумму значений массива
        int arrays_sum=0;
        //создаем условие при котором будет заполняться массив
        for(int i=0;i<long_arrays;i++){
            //добавляем элементы в массив определенные длинной==long_arrays
            arrays[i]= in.nextInt();
            //суммируем элементы массива
            arrays_sum=arrays[i]+arrays_sum;
        }
        //выводим сумму элементов массива (которая хранится в (arrays_sum))
        System.out.println(arrays_sum);
        //создаем условие при котором будет выводиться массив в обратном порядке
        for (int i = arrays.length - 1; i >= 0; i--)
        {
            //выводим массива в обратном порядке
            System.out.println(arrays[i]);
        }
    }
}
