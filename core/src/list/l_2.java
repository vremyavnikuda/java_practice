/*
Добавление элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором будут хранится строковые представления чисел от 0 до n-1.
Затем программа считывает число m (m <= n) и строку s. Вставьте строку s на позицию m.
Выведите список на экран через пробел.

Sample Input:
5
2
Строка

Sample Output:
0 1 Строка 2 3 4
*/
package list;
import java.util.ArrayList;
import java.util.Scanner;

public class l_2 {
    public static void main (String[]args){

        Scanner sc=new Scanner(System.in);
        //получаем исходные данные
        int n= sc.nextInt(),m= sc.nextInt();
        String text= sc.next();
        //инициализируем список
        ArrayList<String> list=new ArrayList<>(n);
        //заполняем его согласно условию задачи
        for (int i=0;i<n;i++){
            list.add(String.valueOf(i));
        }
        //добавляем нужный элемент под определенный индекс
        list.add(m,text);
        //приводим список к строковому формату
        String finaltext=String.join(" ",list);
        //выводим строку
        System.out.print(finaltext);
    }
}
