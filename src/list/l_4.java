/*
Удаление элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором будут хранится строковые представления чисел от 0 до n-1.
Затем программа считывает число m (m < n). Удалите  элемент на позиции m.
Выведите список на экран через пробел.

Sample Input:
5
2

Sample Output:
0 1 3 4
*/
package list;
import java.util.ArrayList;
import java.util.Scanner;

public class l_4 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(),m= sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(i);
        }
        list.remove(m);

        for (Integer i:list){
            System.out.print(i+" ");
        }
    }
}
