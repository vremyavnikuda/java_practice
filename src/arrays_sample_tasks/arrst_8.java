/*
Задача 8
Вводится натуральное число n (n > 1).
На следующей строчке вводятся n целых чисел. Считайте их как массив на n элементов.
Найдите количество элементов, которые больше предыдущего элемента.

Sample Input 1:
5
1 3 -4 6 2

Sample Output 1:
2

Sample Input 2:
4
5 3 2 0

Sample Output 2:
0
*/
package arrays_sample_tasks;
import java.util.Scanner;
public class arrst_8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //задаем длинну массива
        int number= sc.nextInt();
        //инициализируем массив
        int array[]=new int[number];
        //создаем условие заполнения массива
        for (int i=0;i<array.length;i++){
            //заполняем массив
            array[i]= sc.nextInt();
        }
        //создадим переменную которая будет кол-во элементов ,которые больше предыдушего элемента
        boolean qw=false;
        int output=0;
        //создаем условие проверки кол-во элементов, которые больше предыдущего элемента
        for(int i=0;i<array.length-1;i++){
            //сравниваем элемент с предыдущим элементом
            //если array[i]<array[i+1]
            if (array[i]<array[i+1]){
                //+1 к output
                output+=1;
            }
            //если нет (ну и пошел нахуй)
            else continue;
        }
        //выводим результат output
        System.out.print(output);
    }
}
