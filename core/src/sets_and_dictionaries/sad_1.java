/*
Словарь синонимов
Вам дан словарь, состоящий из пар слов.
Каждое слово является синонимом к парному ему слову. Все слова в словаре различны.
Для слова из словаря, записанного в последней строке, определите его синоним.
Вводится число n. Затем 2*n строк. И Ещё одна строка - синоним для которой нужно вывести.

Sample Input:
3
Hello
Hi
Bye
Goodbye
List
Array
Goodbye

Sample Output:
Bye
*/
package sets_and_dictionaries;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sad_1 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String st1 = sc.next();
            String st2 = sc.next();
            map.put(st1, st2);
            map.put(st2, st1);
        }
        String str = sc.next();

        for (String key : map.keySet()) {
            if (key.equals(str))
                System.out.println(map.get(key));
        }
        sc.close();
    }
}
