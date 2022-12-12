/*
Max swap Min
С клавиатуры вводится число n (n >= 2) за ним вводится n действительных чисел.
Ваша задача - поменять местами максимальный и минимальный элементы. после чего выведите на экран массив через пробел.
Гарантируется, что максимальный и минимальный элементы содержатся в единственном экземпляре.

Sample Input:
6
0.5 6.0 -7.0 3.0 -2.67 12.0

Sample Output:
0.5 6.0 12.0 3.0 -2.67 -7.0
*/
package sets_and_dictionaries.additional_task;
import java.util.Arrays;
import java.util.Scanner;

public class task_5 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        double []arrays=new double[n];
        for (int i=0;i<n;i++){
            arrays[i]= sc.nextDouble();
        }

        double min=arrays[0],max=arrays[0];
        int index_min=0,index_max=0;


        for (int i=0;i< arrays.length;i++){
            if (arrays[i]<min){
                min=arrays[i];
                index_min=i;
            }
            if (arrays[i]>max){
                max=arrays[i];
                index_max=i;
            }
        }
        for (int i=0;i< arrays.length;i++){
            if (i==index_min)
                arrays[i]=max;
            else if (i==index_max)
                arrays[i]=min;
        }
        for (double q:arrays){
            System.out.print(q+" ");
        }
    }
}
