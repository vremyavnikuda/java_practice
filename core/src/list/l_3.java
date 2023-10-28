/*
Замена элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором будут хранится строковые представления чисел от 0 до n-1.
Затем программа считывает число m (m < n) и строку s. Замените строкой s элемент на позиции m.
Выведите список на экран через пробел.

Sample Input:
5
2
Строка

Sample Output:
0 1 Строка 3 4
*/
package list;
import java.util.ArrayList;
import java.util.Scanner;

public class l_3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(),m= sc.nextInt();
        String text= sc.next();
        ArrayList<String>list=new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(String.valueOf(i));
        }
        list.set(m,text);
        String finaltext=String.join(" ",list);
        System.out.print(finaltext);
    }
}
