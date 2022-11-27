/*
Чётные индексы
Дан массив, состоящий из целых чисел. Нумерация элементов начинается с 0.
Напишите программу, которая выведет элементы массива, номера которых четны (0, 2, 4...).

Входные данные
Сначала задано число N — количество элементов в массиве (1 ≤ N ≤ 100).
Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести все элементы массива с чётными номерами.

Sample Input:
6
1 3 5 2 4 7

Sample Output:
1 5 4
*/
package two_dimensional_arrays.additional_task;
import java.util.Scanner;
public class at_1 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        //задаем длину массива
        int n= sc.nextInt();
        //инициализируем массив
        int []array=new int[n];
        //переменная которой будем присваивать четные индексы
        int index=0;
        //условие заполнения массива
        for (int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        //условие получения четных индексов массива
        for (index=0;index< array.length;index+=2){
            System.out.print(array[index]+" ");
        }
    }
}
