/*
Симметричная ли матрица?
Проверьте, является ли двумерный массив симметричным относительно главной диагонали.
Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.

Входные данные
Программа получает на вход число n < 100, являющееся числом строк и столбцов в массиве.
Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.

Выходные данные
Программа должна выводить слово YES для симметричного массива и слово NO для несимметричного.

Sample Input 1:
3
0 1 2
1 5 3
2 3 4

Sample Output 1:
YES

Sample Input 2:
3
0 0 0
0 0 0
1 0 0

Sample Output 2:
NO
*/
package two_dimensional_arrays.additional_task;
import java.util.Scanner;
public class at_7 {
    public static void main (String[]args){
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int [][]array=new int[n][n];
        for (int i= 0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                array[i][j]= in.nextInt();
            }
        }
        int q1=0,q2=0;
        for(int i=0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                if (i<j){
                    q1=q1+ array[i][j];
                    continue;
                }
                if (i>j){
                    q2=q2+ array[i][j];
                }
            }
        }
        if (q1==q2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
