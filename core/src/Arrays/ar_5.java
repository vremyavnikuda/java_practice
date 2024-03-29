/*Поменяться местами
Дан список (сначала количество элементов, потом сами элементы).
Потом водятся два числа: a и b.
Поменяйте местами значения a-ого и b-ого элементов массива и выведите его на экран построчно.
Гарантируется, что а и b не выходят за границы размеров массива.

Sample Input:
5
12
78
45
378
12
2
4

Sample Output:
12
78
12
378
45
*/
package Arrays;
import java.util.Scanner;
public class ar_5 {
    public static void main (String[]args){
        Scanner in =new Scanner(System.in);

        //указываем длинну массива
        int long_arrays= in.nextInt();
        //инициализируем массив
        int[]arrays=new int[long_arrays];

        //создаем условие заполнения массива данными определенный длинной == long_arrays
        for (int i=0;i<arrays.length;i++)
        {
            arrays[i] = in.nextInt();
        }

        //меняем местами элементы массива под индексами (a) и (b)
        //вводим интересующие нас индексы массива
        int arrays_index_a = in.nextInt(),arrays_index_b = in.nextInt();
        //создаем временную переменную в которой храним значение arrays_index_a
        int temp_a = arrays[arrays_index_a];
        //меняем значение
        arrays[arrays_index_a] = arrays[arrays_index_b];
        //меняем значение элемента массива на, то что хранится temp_a
        arrays[arrays_index_b] = temp_a;

        //создаем условие вывода массива
        for (int i =0;i<long_arrays;i++)
        {
            //выводим массив на экран
            System.out.println(arrays[i]);
        }
    }
}
