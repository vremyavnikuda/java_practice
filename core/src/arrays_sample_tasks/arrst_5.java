/*
Задача 5 (средне)
Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Напишите код, который создаст массив с именем array на n элементов,
в котором буду храниться введённые числа (элемент массива равен соответствующему числу в во второй строке).
На следующей строке вводится 2 числа - индексы элементов, сумму которых вам надо найти.
Выведите на экран сумму этих двух элементов.
Если вдруг индекс индекс оказался вне пределов диапазона от 0 до n - 1, то выведите на экран слово Error.

Sample Input 1:
5
12 3 -4 6 2
0 3

Sample Output 1:
18

Sample Input 2:
3
9 -4 3
1 10

Sample Output 2:
Error
*/
package arrays_sample_tasks;
import java.util.Scanner;
public class arrst_5 {
    public static void main (String[]args){
        Scanner in =new Scanner(System.in);
        //Указываем длинну массива
        int arr_length= in.nextInt();
        //Инициализируем массив
        int[] array =new int[arr_length];
        //Задаем условие заполнения массива
        for (int i=0;i<array.length;i++){
            int a= in.nextInt();
            array[i]=a;
        }
        //Задаем переменные по которым нам необходимо найти нужные элементы массива
        int a= in.nextInt(),b= in.nextInt();
        //Заводим переменную куда складывать будем сумму элементов a+b
        int sum_ab=0;
        //Задаем условие(исключение) вывода суммы элементов массива
        if (0<=a&&a<array.length&&0<=b&&b<array.length){
            //Вывод массива
            System.out.print(array[a]+array[b]);
        //Исключение
        }else System.out.print("Error");
    }
}
