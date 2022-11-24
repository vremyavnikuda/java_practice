/*
Задача 12
Вводится натуральное число n.
На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. на следующей строке вводятся два индекса: l и r.
Найдите среднее арифметическое всех элементов с индексами от l до r включительно.
Выведите в ответ одно действительное число. Гарантируется, что 0 <= l <= r < n.

Sample Input 1:
5
1 2 3 2 3
1 2

Sample Output 1:
2.5

Sample Input 2:
8
1 2 3 1 2 1 2 1
3 6

Sample Output 2:
1.5
*/
package arrays_sample_tasks;
import java.util.Scanner;
public class arrst_12 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        /////////////////////////////массив
        int size= sc.nextInt();
        int array[]=new int[size];
        for (int i =0;i<size;i++){
            array[i]= sc.nextInt();
        }
        /////////////////////////////
        double sum=0;
        double count=0;
        //наш диапазон индексов от i до r
        int i= sc.nextInt(),r= sc.nextInt();
        ////////////////////////////////////
        //задаем условие j=i и j<=r j++
        for (int j=i;j<=r;j++){
            //суммируем диапазон в переменную sum
            sum+=array[j];
            //матаем счетчик сколько раз он это сделал
            count++;
        }
        ////////////////////////////////////
        //считаем средне-арифметическое значение
        double sum_all=sum/count;
        //выводим результат
        System.out.println(sum_all);
    }
}
