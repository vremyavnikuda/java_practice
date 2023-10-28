/*
Новый поворот
Вводятся 2 натуральных числа:  n и m.
Затем вводится двумерный массив размером n*m.
Поверните его на 90 градусов против часовой стрелке и выведите на экран (через пробел).

Sample Input:
3
4
1 2 3 8
4 6 7 8
-5 6 3 4

Sample Output:
8 8 4
3 7 3
2 6 6
1 4 -5
*/
package two_dimensional_arrays;
import java.util.Scanner;
public class tda_9 {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt(),m=input.nextInt();

        System.out.println("-------------");
        //инициализация двумерного массива
        int [][]arrays=new int[n][m];
        //условие заполнения массива
        for (int i=0;i<arrays.length;i++){
            for (int j=0;j<arrays[i].length;j++){
                //заполняем массив
                arrays[i][j]=input.nextInt();
            }
        }
        //Повернуть массив на 90 градусов против часов стрелки и вывести его на экран (через пробел)
        //инициализация массива с поворотом на 90 градусов против часовой стрелки
        int [][]arrays_90=new int[m][n];
        //задаем условие заполнения массива
        for (int i=0;i<arrays.length;i++){
            for (int j =0;j<arrays[i].length;j++){
                //заполнение массива и условие поворота его на 90 градусов против часовой стрелки
                arrays_90[m-j-1][i]=arrays[i][j];
            }
        }
        //условие вывода массива с повотором на 90 градусов против часовой стрелки (через пробел)
        for (int i=0;i<arrays_90.length;i++){
            for (int j=0;j<arrays_90[i].length;j++){
                System.out.print(arrays_90[i][j]+" ");
            }
            System.out.println();
        }
    }
}
