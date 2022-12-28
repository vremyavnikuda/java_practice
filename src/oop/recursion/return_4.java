/*
Отформатировать российский номер телефона
Напишите функцию format_number, которая  будет принимать в качестве аргумента строку, которая должна содержать
телефонный номер. И выводить его по образцу: 8 (987) 654-32-10.

Телефонный номер должен состоять ровно из 11 цифр. Если в введённой строке больше или меньше символов, то функция
должна вывести на экран "Неверное число символов".
Если в номере встретится хотя бы один символ, который не является цифрой, то функция должна вывести на экран
"Не все символы являются цифрами"
Российские номера начинаются только с 8 (для простоты задачи). Если номер начинается не с 8, то функция должна
вывести на экран "Это не российский номер телефона"
Если с номером всё в порядке, то функция должна вывести на экран номер телефона по указанному выше образцу.
Содержание функции main менять запрещено.

Примечание: проверка условий должна выполняться в том же порядке, что и перечисленные выше условия. То есть, если в
строке и не 11 символов и присутствует буква, то программа должна вывести: "Неверное число символов".


Sample Input 1:
89876543210

Sample Output 1:
8 (987) 654-32-10

Sample Input 2:
8987654321

Sample Output 2:
Неверное число символов

Sample Input 3:
8987654321q

Sample Output 3:
Не все символы являются цифрами

Sample Input 4:
69876543210

Sample Output 4:
Это не российский номер телефона
*/
package oop.recursion;

import java.util.Scanner;

public class return_4 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String number=sc.nextLine();
        format_number(number);
    }

        /**
         * Форматирует заданный номер телефона в соответствии со следующими правилами:
         * - Если в номере меньше или больше 11 символов, выводится "Недопустимое количество символов" и возвращается.
         * - Если номер не начинается с 8, печатается "Это не российский номер телефона" и возвращается.
         * - Если номер содержит нецифровые символы, печатается "Не все символы являются цифрами" и возвращается.
         * - Иначе, форматирует номер как 8 (987) 654-32-10 и выводит.
         *
         * @param number номер телефона, который необходимо отформатировать
         */
    static void format_number(String s) {
        // Проверяем, что строка содержит ровно 11 символов
        if (s.length() != 11) {
            System.out.println("Неверное число символов");
            return;
        }
        // Проверяем, что все символы являются цифрами
        if (!s.matches("[0-9]+")) {
            System.out.println("Не все символы являются цифрами");
            return;
        }
        // Проверяем, что строка начинается с цифры 8 (что указывает на российский номер телефона)
        if (!s.startsWith("8")) {
            System.out.println("Это не российский номер телефона");
            return;
        }
        // Форматируем строку с использованием строкового шаблона
        String formattedNumber = String.format("%s (%s) %s-%s-%s",
                s.substring(0, 1),
                s.substring(1, 4),
                s.substring(4, 7),
                s.substring(7, 9),
                s.substring(9, 11)
        );
        System.out.println(formattedNumber);
    }
}
