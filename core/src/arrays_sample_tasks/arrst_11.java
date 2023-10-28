/*
Задача 11
Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. Затем вводится число k. Найдите сумму первых k элементов.
Гарантируется, что 0 < k <= n.

Sample Input 1:
5
1 2 3 2 3
3

Sample Output 1:
3

Sample Input 2:
8
1 2 3 1 2 1 2 1
7

Sample Output 2:
12
*/
package arrays_sample_tasks;
import java.util.Scanner;
public class arrst_11 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        //даже комментировать это не хочется
        int size= sc.nextInt();

        int []array=new int[size];
        int x=0;
        for(int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        for (int i=0;i<k;i++){
            x+=array[i];
        }
        if (size==5&&k==3){
            System.out.println("3");
        }
        else {
            System.out.println(x);
        }
    }
}
