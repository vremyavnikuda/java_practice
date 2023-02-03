/*
Стек
Напишите программу, которая реализует структуру данных стек, используя список.

Условие задачи таково: мальчик Петя использует свой стул в качестве многоместной вешалки.
А именно: накидывает на него вещи. Иногда он забирает верхнюю вещь.
Нужно вывести на экран порядок его вещей от спинку стула.

Сначала водится число n - количество запросов в вашей программе. Каждый из запросов будет иметь один следующих видов:

push <одежда> - Петя вешает на стул элемент одежды
pop - снимает одежду со стула. При этом на экран выводится запись вида "Петя взял <одежда>"
После выполнения всех запросов выведите оставшиеся на стуле вещи. Гарантируется, что название вещи состоит из одного слова.

Sample Input:
4
push Футболка
push Рубашка
pop
push Джинсы

Sample Output:
Петя взял Рубашка
Футболка Джинсы
*/
package list;
import java.util.ArrayList;
import java.util.Scanner;

public class l_7 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        int n= sc.nextInt();
        String str =null;
        for (int i=0;i<n;i++){
            String str1= sc.next();
            if (str1.equalsIgnoreCase("push")){
                list.add(sc.next());
            }
            if (str1.equalsIgnoreCase("pop")){
                str= list.remove(list.size()-1);
                System.out.println("Петя взял"+" "+str);
                //list.remove(0);
            }
        }
        System.out.println(String.join(" ",list));
    }
}