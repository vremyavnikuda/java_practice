/*
Я Занимала 2!
Напишите программу, которая будет формировать очередь оформления заявок в МФЦ. Сначала водится число n -
количество запросов в вашей программе. Каждый из запросов будет иметь один следующих видов:

"Добавить <ИМЯ>" - Добавить человека с именем ИМЯ в конец очереди. Вывести на экран фразу "<ИМЯ> в очереди"
"Следующий!" - вызвали человека, следующего первым по очереди. При этом человек с именем ИМЯ уходит из очереди
и на экране появляется строка вида "<ИМЯ> в обработке".
"<ИМЯ1> занимала/занимал за <ИМЯ2>" - человек с именем ИМЯ1 становится в очередь за человеком по имени ИМЯ2.
Если этот человек сейчас находится в обработке, то ИМЯ1 становится в начало очереди. Если такого человека в очереди
 нет, то ИМЯ1 становится в конец списка, при этом в консоль выводится фраза "<ИМЯ1, не надо тут ля-ля>".
"Посмотреть очередь" - на экран в консоль выводится вся очередь через пробел.
"Стоит ли оно того? <ИМЯ>" - человек с именем ИМЯ смотрит на очередь, если в ней сейчас меньше 5 человек,
то он становится в конец очереди, если нет - то уходит, а в консоли появляется надпись "Слабак!"
Помимо этого, если вызывают следующего человека, а в очереди никого нет, то вывести в консоль фразу
"Отлично, попью чаёк!". Если очередь пуста, а её пытаются вывести на экран, то следует вывести
"*прокатилось перекати-поле*"

Sample Input:
15
Добавить Игорь
Добавить Антон
Добавить Катя
Лиза занимала за Игорь
Посмотреть очередь
Стоит ли оно того? Вася
Следующий!
Следующий!
Валя занимала за Игорь
Следующий!
Следующий!
Посмотреть очередь
Следующий!
Следующий!
Следующий!

Sample Output:
Игорь в очереди
Антон в очереди
Катя в очереди
Игорь Лиза Антон Катя
Игорь в обработке
Лиза в обработке
Валя, не надо тут ля-ля
Антон в обработке
Катя в обработке
Вася Валя
Вася в обработке
Валя в обработке
Отлично, попью чаёк!
*/
package list;
import java.util.ArrayList;
import java.util.Scanner;
public class l_8 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String name = "";
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> queue = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            int firstIndexOfSpace = command.trim().indexOf(" ");
            int lastIndexOfSpace = command.trim().lastIndexOf(" ");
            if (command.startsWith("Добавить")) {
                queue.add(command.substring(firstIndexOfSpace + 1));

                System.out.println(queue.get(i) + " " + "в очереди");
            } else if (command.equals("Следующий!")) {
                if (queue.size() > 0) {
                    name = queue.get(0);
                    queue.remove(0);
                    System.out.println(name + " " + "в обработке");
                } else if (queue.size() == 0) {
                    System.out.println("Отлично, попью чаёк!");
                }
            } else if (command.contains("занимал")) {
                if (name.equals(command.substring(lastIndexOfSpace + 1))) {
                    queue.add(0, command.substring(0, firstIndexOfSpace));
                } else if (queue.contains(command.substring(lastIndexOfSpace + 1))) {
                    queue.add(queue.indexOf(command.substring(lastIndexOfSpace + 1)) + 1, command.substring(0, firstIndexOfSpace));
                } else if (!name.equals(command.substring(lastIndexOfSpace + 1)) && !queue.contains(command.substring(lastIndexOfSpace + 1))) {
                    queue.add(queue.size(), command.substring(0, firstIndexOfSpace));
                    System.out.println(command.substring(0, firstIndexOfSpace) + ", не надо тут ля-ля");
                }

            } else if (command.equals("Посмотреть очередь")) {
                if (queue.size() > 0) {
                    System.out.print(String.join(" ", queue));
                    System.out.println();
                } else if (queue.size() == 0) {
                    System.out.println("*прокатилось перекати-поле*");
                }
            } else if (command.contains("Стоит ли оно того")) {
                if (queue.size() < 5) {
                    queue.add(queue.size(), command.substring(lastIndexOfSpace + 1));
                } else if (queue.size() >= 5) {
                    System.out.println("Слабак!");
                }
            }
        }
    }
}
