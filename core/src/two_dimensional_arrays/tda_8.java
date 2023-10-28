/*
Поворот на 90
Вводятся 2 натуральных числа: n и m.
Затем вводится двумерный массив размером n*m.
Поверните его на 90 градусов по часовой стрелке и выведите на экран (через пробел).

Sample Input:
3
4
1 2 3 8
4 6 7 8
-5 6 3 4

Sample Output:
-5 4 1
6 6 2
3 7 3
4 8 8
 */
package two_dimensional_arrays;
import java.util.Scanner;
public class tda_8 {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt(),m= in.nextInt();
        //разделим 2 ввода информации для лучшего понимания что вводим
        System.out.println("-------------");
        //инициализация двумерного массива
        int [][]arrays=new int[n][m];
        //условие заполнения массива
        for (int i=0;i< arrays.length;i++){
            for (int j =0;j< arrays[i].length;j++){
                //запоняем массив
                arrays[i][j]= in.nextInt();
            }
        }
        //Повернуть массив на 90 градусов по часовой стрелке и вывести через пробел
        //создаем массив певернутый на 90 градусов
        int [][] arrays90 = new int[m][n];
        //создаем условие заполнения массива с поворотом на 90 градусов
        for (int i=0;i<arrays.length;i++){
            for (int j =0;j<arrays[i].length;j++){
                //заполняем массив данными массива arrays
                arrays90[j][n-i-1]=arrays[i][j];
            }
        }

        //создаем условие вывода массива
        for (int i=0;i<arrays90.length;i++){
            for (int j=0;j<arrays90[i].length;j++){
                System.out.print (arrays90[i][j]+" ");
            }
            System.out.println();
        }
    }
}
