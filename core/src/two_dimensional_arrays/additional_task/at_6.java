/*
Побочная диагональ
Дано число n (n < 10). Создайте массив n×n и заполните его по следующему правилу:
- числа на диагонали, идущей из правого верхнего в левый нижний угол, равны 1;
- числа, стоящие выше этой диагонали, равны 0;
- числа, стоящие ниже этой диагонали, равны 2.

Входные данные
Программа получает на вход число n (1 < n).

Выходные данные
Необходимо вывести  полученный массив. Числа разделяйте одним пробелом.

Sample Input:
4

Sample Output:
0 0 0 1
0 0 1 2
0 1 2 2
1 2 2 2
*/
package two_dimensional_arrays.additional_task;
import java.util.Scanner;
public class at_6 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int [][]arrays=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(i==j)
                    arrays[i][j]=1;
                if(j>i)
                    arrays[i][j]=0;
                if(i>j)
                    arrays[i][j]=2;
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println();
        }
    }
}
