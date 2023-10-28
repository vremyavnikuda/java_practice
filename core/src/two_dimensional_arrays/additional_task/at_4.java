/*
Больше соседей
Дан массив, состоящий из целых чисел.
Напишите программу, которая в данном массиве определит количество элементов,
 у которых есть два соседних и, при этом, оба соседних элемента меньше данного.

Входные данные
Сначала задано число N — количество элементов в массиве (3 ≤ N ≤ 100).
Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести количество элементов массива, у которых есть два соседа и которые
при этом строго больше обоих своих соседей.

Sample Input 1:
5
1 2 3 4 5

Sample Output 1:
0

Sample Input 2:
6
1 5 1 5 1 7

Sample Output 2:
2
*/
package two_dimensional_arrays.additional_task;
import java.util.Scanner;
public class at_4 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []array=new int[n];

        //флаг сравнения
        int flag=0;

        //инициализация массива
        for (int i=0;i< array.length;i++){
            //заполняем массив
            array[i]= sc.nextInt();
        }
        //условие сравнения
        for (int i=0;i<array.length;i++){
            //если i>1
            if (i>1) {
                //и если [i-2]<[i-1] или i[1]<[i-1]
                if ((array[i - 2] < array[i - 1]) && (array[i] < array[i - 1])) {
                    //увеличиваем значение flag +1
                    flag++;
                }
            }
        }
        //Выводим результат
        System.out.println(flag);
    }
}
