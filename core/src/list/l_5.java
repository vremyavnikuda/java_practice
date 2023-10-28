/*
Очередь
Напишите программу, которая реализует структуру данных очередь, используя список.

Условие задачи таково: пользователь листает список музыки и добавляет в
плейлист понравившиеся ему композиции. Когда песня доигрывает, включается следующая.
Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.

Сначала вводится число n - количество запросов к вашей программе.
Каждый из запросов будет иметь один следующих видов:

push <Название трека> - добавляет трек в плейлист
pop - удаляет из плейлиста первый трек.

При этом на экран выводится запись вида "воспроизводится <название трека>"
После выполнения всех запросов выведите оставшиеся в очереди треки.
Гарантируется, что название трека состоит из одного слова.

Sample Input:
4
push Трек1
push Трек3
pop
push ТрекТрек

Sample Output:
воспроизводится Трек1
Трек3 ТрекТрек
*/
package list;

import java.util.ArrayList;
import java.util.Scanner;

public class l_5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList <String>list=new ArrayList<>();
        int n= sc.nextInt();
        String str=null;
        for (int i=0;i< n;i++){
            String str1= sc.next();
            if (str1.equalsIgnoreCase("push")){
                list.add(sc.next());
            }
            if (str1.equalsIgnoreCase("pop")){
                str= list.get(0);
                System.out.println("воспроизводится"+" "+str);
                list.remove(0);
            }
        }
        System.out.println(String.join(" ",list));
    }
}
