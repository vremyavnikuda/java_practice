/*
Задача 9
Вводится натуральное число n.
На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. Затем вводится число k.
Найдите индекс элемента k. Если такого элемента нет в массиве, выведите на экран слово Error.

Sample Input 1:
5
1 2 3 5 4
5

Sample Output 1:
3

Sample Input 2:
8
1 34 56 23 76 56 90 4
3

Sample Output 2:
Error
*/
package arrays_sample_tasks;
import java.util.Scanner;
public class arrst_9 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);

        //задаем длинну массива
        int number= sc.nextInt();

        //инициализируем массив
        int []array=new int[number];

        //создаем условие заполнения масива
        for(int i=0;i<array.length;i++){
            //заполняем массив
            array[i]= sc.nextInt();
        }

        //какое число будем искать ??????
        int search= sc.nextInt();
        //задаем условие поиска  нужного нам числа по == search числа
        for (int i =0;i<array.length;i++){
            //сравниваем значения которые храняться у нас в массиве array==search
            if(search==array[i]){
                //если нашли это значение,то выводим его индекс (i)
                System.out.println(i);
                //верни результат
                return;
            }
        }
        //если нет ,то пошел на *censored*
        System.out.println("Error");
    }
}
