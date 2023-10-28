/*
Нормальный вид
Вводятся 2 натуральных числа: n и m.
Затем вводится через пробел n*m целых чисел.
Сохраните их в табличном виде и выведите на экран (разделитель - пробел).

Sample Input:
2
3
2 5 89 12 4 -7

Sample Output:
2 5 89
12 4 -7
*/
package two_dimensional_arrays;
import java.util.Scanner;
public class tda_3 {
    public static void main (String []args){
        Scanner in=new Scanner(System.in);
        //задаем длинну массива
        int n = in.nextInt(),m = in.nextInt();
        //инициализируем массивы
        int [][]array=new int[n][m];
        //заполняем массивы
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                array[i][j]= in.nextInt();
            }
        }

        //условие вывода массивов
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            //перенос строки
            System.out.println();
        }
    }
}
