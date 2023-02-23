package основы_java.Основные_типы_данных.Ввод_данных_с_клавиатуры;

import java.util.Scanner;

/*
Площадь и периметр
На одной строчке через пробел записаны два целых числа: длина и ширина прямоугольника. Вычислите его площадь и периметр (именно в таком порядке). Результат выведите на разных строках.

Sample Input:
5 10

Sample Output:
50
30
*/
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
        System.out.println((a + b) * 2);
    }
}
