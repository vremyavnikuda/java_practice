/*
Задача 4
Вводится натуральное число n.
 На следующей строчке вводятся n целых чисел.
 Напишите код, который создаст массив с именем array на n элементов,
 в котором буду храниться введённые числа (элемент массива равен соответствующему
 числу в во второй строке). На следующей строке вводится 2 числа - индексы элементов,
 сумму которых вам надо найти. Выведите на экран сумму этих двух элементов.
 Гарантируется, что индексы лежат в диапазоне от 0 до n - 1.

Sample Input 1:
5
12 3 -4 6 2
0 3

Sample Output 1:
18

Sample Input 2:
3
9 -4 3
1 2

Sample Output 2:
-1
*/
package arrays_sample_tasks;
import java.util.Scanner;
public class arrst_4 {
    public static void main (String []args){
        Scanner in =new Scanner(System.in);
        //Указывае длинну массива
        int n= in.nextInt();
        //Инициализируем массив
        int array[]=new int[n];
        //Задаем условие заполнение массива
        for (int i =0;i<array.length;i++){
            //Заполняем массив
            int a = in.nextInt();
            //Складываем данные в массив
            array[i]=a;
        }
        //Задаем переменные по котором нам необходимо найти нужные элементы массива
        int a= in.nextInt(),b= in.nextInt();
        //переменная куда сложим результат
        int sum_ab=0;
        //Выводим результат
        System.out.print(array[a]+array[b]);
    }
}
