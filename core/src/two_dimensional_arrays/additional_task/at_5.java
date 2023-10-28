/*
Сортировка массива
Дан массив, состоящий из целых чисел. Напишите программу, которая отсортирует его по возрастанию.

Входные данные
Сначала задано число N — количество элементов в массиве (1 ≤ N ≤ 100).
Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести отсортированный по возрастанию массив.

Комментарий
Существует ооооочень большое количество различных сортировок. Самая простая из них - сортировка "пузырьком".

Sample Input:
7
3 4 2 5 8 9 2

Sample Output:
2 2 3 4 5 8 9
*/
package two_dimensional_arrays.additional_task;
import java.util.Scanner;
public class at_5 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        //инициализация массива
        int []array=new int[n];
        int temp;
        boolean sorted=false;
        //условие заполнения массива
        for(int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
        }
        //цикл сортировки массива
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                int f = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        sorted=false;
                    }
                }
            }
        }
        //вывод массива
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
