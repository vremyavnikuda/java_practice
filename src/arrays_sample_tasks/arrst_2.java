/*
Задача 2
Вводится натуральное число n.
Допишите код, который создаст массив с именем array на n элементов,
в котором буду храниться квадраты чисел от 0 до n - 1 (элемент равен квадрату индекса).

Написанный код менять запрещено.

Sample Input 1:
5

Sample Output 1:
0 1 4 9 16

Sample Input 2:
3

Sample Output 2:
0 1 4
*/
package arrays_sample_tasks;
import java.util.Scanner;
public class arrst_2 {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        //длинна массива
        int n= sc.nextInt();
        //инициализация массива
        int[] array =new int[n];
        //условие заполнение массива
        for(int i=0;i<array.length;i++){
            //условие изменение массива
            array[i]=i*i;
            //вывод массива
            System.out.print(array[i]+" ");
        }
    }
}
