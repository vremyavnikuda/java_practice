/*
Соседи одного знака
Дан массив, состоящий из целых чисел.
Напишите программу, которая определяет, есть ли в массиве пара соседних элементов с одинаковыми знаками.

Входные данные
Сначала задано число N — количество элементов в массиве (2 ≤ N ≤ 10000).
Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести слово YES, если существует пара соседних элементов с одинаковыми знаками.
В противном случае следует вывести слово NO.

Sample Input:
5
1 -3 4 -2 1
Sample Output:
NO
*/
package two_dimensional_arrays.additional_task;
import java.util.Scanner;
public class at_3 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //задаем длинну массива
        int n= sc.nextInt();
        //выставляем флаг
        int flag=0;
        //инициализируем массив
        int []array=new int[n];
        //задаем условие заполнения массива
        for(int i=0;i<array.length;i++){
            //заполняем массив
            array[i]= sc.nextInt();
        }
        //задаем условие сравнения соседних чисел ,а так же условие изменение флага
        for(int i=0;i<array.length;i+=1){
            if(i-1>=0) {
                if (((array[i] < 0) && (array[i - 1] < 0)) || ((array[i] > 0) && (array[i - 1] > 0))) {
                    flag =0;
                } else {
                    flag++;
                }
            }
        }
        //проверяем состояние флага
        if(n==0) {
            //==0(исключение если введены 0 значения)
            System.out.println("YES");

        }
        else{
            //!=
            if (flag == array.length - 1) {
                System.out.print("NO");
            }
            //==
            else{
                System.out.print("YES");
            }
        }
    }
}
