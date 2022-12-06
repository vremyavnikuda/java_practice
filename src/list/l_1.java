/*
Создание списка
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором первый и
последний элементы будут равны строчке 1, а между ними будет n 0. Выведите список на экран через пробел.

Sample Input:
3

Sample Output:
1 0 0 0 1
*/
package list;
import java.util.ArrayList;
import java.util.Scanner;

public class l_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<number+2;i++){
            if (i==0||i==number+1){
                list.add(1);
            }
            else list.add(0);
        }
        for (Integer i:list){
            System.out.print(i+" ");
        }
    }
}
