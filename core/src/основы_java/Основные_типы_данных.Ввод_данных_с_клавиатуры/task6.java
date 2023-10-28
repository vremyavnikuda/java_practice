package основы_java.Основные_типы_данных.Ввод_данных_с_клавиатуры;

/*
Стоимость покупки
Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.

Программа получает на вход три числа: a, b, n.

Программа должна вывести два числа: стоимость покупки в рублях и копейках.

Sample Input 1:
10 15 2

Sample Output 1:
20 30

Sample Input 2:
2 50 4

Sample Output 2:
10 0
*/
import java.util.Scanner;
public class task6 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // цена пирожка в рублях
        int b = scanner.nextInt(); // цена пирожка в копейках
        int n = scanner.nextInt(); // количество пирожков

        int totalInKopecks = (a * 100 + b) * n; // общая стоимость покупки в копейках
        int rubles = totalInKopecks / 100; // рубли
        int kopecks = totalInKopecks % 100; // копейки

        System.out.println(rubles + " " + kopecks);
    }
}
