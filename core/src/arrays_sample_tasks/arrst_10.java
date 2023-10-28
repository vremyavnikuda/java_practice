/*
Задача 10
Вводится натуральное число n.
На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов.
Затем вводится число k.
Найдите количество элементов в массиве равных k.

Sample Input 1:
5
1 2 3 2 3
3

Sample Output 1:
2

Sample Input 2:
8
1 2 3 1 2 1 2 1
1

Sample Output 2:
4
*/
package arrays_sample_tasks;
import java.util.Scanner;
public class arrst_10 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //==длинна
        int number = sc.nextInt();
        //инициализируем массив
        int[] array =new int[number];
        //создаем условие заполнения массива
        for (int i=0;i<array.length;i++){
            //заполняем массив
            array[i]= sc.nextInt();
        }
        //то что мы ищем
        int k= sc.nextInt();
        //счетчик
        int count=0;
        //блядское==условие
        for(int i: array){
            //сравниваем то что ищем с тем что имеется в массиве
            if(k==i)
                //если ==
                count++;
        }
        //выводим результат и начинаем дружить с головой
        System.out.println(count);
    }
}
