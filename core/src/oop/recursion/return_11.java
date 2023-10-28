/*
Простая динамика
На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать по ним вниз, к основанию.
Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2. (То есть,
если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.)
Определить число всевозможных "маршрутов" мячика с вершины на землю.

Подсказка: Если ваша программа работает слишком долго, то может использовать кеш?

Sample Input 1:
3

Sample Output 1:
4

Sample Input 2:
10

Sample Output 2:
274
*/
package oop.recursion;

import java.util.Scanner;

public class return_11 {
    public static int numRoutes(int n) {
        // инициализируем массив результатов для ступенек 0, 1 и 2
        int[] results = {1, 1, 2};
        // цикл от 3 до n
        for (int i = 3; i <= n; i++) {
            // результат для ступеньки i равен сумме результатов для ступенек i-1, i-2 и i-3
            int result = results[(i-1) % 3] + results[(i-2) % 3] + results[(i-3) % 3];
            results[i % 3] = result;
        }
        // возвращаем результат для ступеньки n
        return results[n % 3];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numRoutes(n));
    }
}

