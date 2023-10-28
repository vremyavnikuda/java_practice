/*
Много вставок
Создайте список, содержащий строковые представления первых n  натуральных чисел.
Затем добавьте в список k элементов на нужные позиции.

Входные данные:
На первой строчке вводится число n, на второй число k. Затем вводится k пар чисел.
В каждой паре первое число - объект, который надо вставить в список, а второе - индекс, куда его нужно вставить,
 гарантируется, что все индексы корректны.

Выходные данные:
Выведите полученный список на экран через пробел.

Sample Input:
5
3
3 0
4 2
9 5

Sample Output:
3 1 4 2 3 9 4 5
*/
package sets_and_dictionaries;
import java.util.ArrayList;
import java.util.Scanner;
public class sad_0 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<String>();
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            list.add(String.valueOf(i));
        }
        int k= sc.nextInt();
        for (int i=0;i<k;i++){
            int q= sc.nextInt();
            int w= sc.nextInt();
            list.add(w, String.valueOf(q));
        }
        String finalx=String.join(" ",list);
        System.out.print(finalx);
    }
}
