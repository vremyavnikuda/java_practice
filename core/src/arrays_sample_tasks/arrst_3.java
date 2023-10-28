/*
Задача 3
Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Допишите код, который создаст массив с именем array на n элементов,
в котором буду храниться введённые числа (элемент массива равен соответствующему числу
в во второй строке).

Написанный код менять запрещено.

Sample Input 1:
5
12 3 -4 6 2

Sample Output 1:
12 3 -4 6 2

Sample Input 2:
3
9 -4 3

Sample Output 2:
9 -4 3
*/
package arrays_sample_tasks;
import java.util.Scanner;
public class arrst_3 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //обозначаем длинну массива
        int n = sc.nextInt();
        //инициализируем массив
        int []array=new int[n];
        //добавляем условие заполнение массива
        for (int i=0;i<array.length;i++){
            //заполняем массив данными до длинны(массива)[n]
            array[i] =sc.nextInt();
        }
        //Условие вывода массива
        for (int i=0;i<array.length;i++){
            //выводим данные массива
            System.out.print(array[i]+" ");
        }
    }
}
