/*
Я Занимала!
Напишите программу, которая будет формировать очередь оформления заявок в МФЦ.
Сначала водится число n -  количество запросов в вашей программе. Каждый из запросов будет иметь один следующих видов:

"Добавить <ИМЯ>" - Добавить человека с именем ИМЯ в конец очереди
"Следующий!" - вызвали человека, следующего первым по очереди.
При этом человек с именем ИМЯ уходит из очереди.
"<ИМЯ1> занимала за <ИМЯ2>" - человек с именем ИМЯ1 становится в очередь за человеком по имени ИМЯ2.
гарантируется, что человек, за которым занимали очередь стоит в ней.
Гарантируется, что все люди имеют различные имена и при вызове следующего человека, очередь не пуста.

Выведите на экран через пробел очередь после совершения всех запросов.

Sample Input:
5
Добавить Лена
Добавить Коля
Марина занимала за Лена
Следующий!
Добавить Игорь

Sample Output:
Марина Коля Игорь
*/
package list;
import java.util.ArrayList;
import java.util.Scanner;

public class l_6 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        int n= sc.nextInt();
        String str_name=null;
        for (int i=0;i<n;i++){
            String str_new= sc.next();
            if (str_new.equalsIgnoreCase("Добавить")){
                list.add(sc.next());
                //System.out.println("Добавлен в очередь");
                continue;
            }
            if (str_new.equalsIgnoreCase("Следующий!")){
                list.remove(0);
                continue;
            }
            if (!str_new.equalsIgnoreCase("Добавить")&&!str_new.equalsIgnoreCase("Следующий")){
                sc.next();
                sc.next();
                list.add(list.indexOf(sc.next())+1,str_new);
            }
        }
        System.out.println(String.join(" ",list));
    }
}
