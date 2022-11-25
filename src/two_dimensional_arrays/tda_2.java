/*
Таблица умножения
Вводятся 2 натуральных числа: n и m. Выведите на экран таблицу умножения размером n*m через пробел.

Sample Input:
3
4

Sample Output:
1 2 3 4
2 4 6 8
3 6 9 12
*/
package two_dimensional_arrays;
import java.util.Scanner;
public class tda_2 {
    public static void main (String[]args){
        Scanner in =new Scanner(System.in);
        //длинна массива n и длинна массива m
        int n= in.nextInt(),m= in.nextInt();
        //инициализируем двумерный массив
        int [][]array=new int[n][m];
        //условие заполнения массива n
        for(int i=0;i<n;i++){
            //условие заполнение массива m
            for (int j=0;j<m;j++){
                //заполняем массив
                //array[i][j]==(i+1)*(j+1)
                array[i][j]=(i+1)*(j+1);
            }
        }
        //условие вывода массивов
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            //создаем перенос строки
            System.out.println();
        }
    }
}
