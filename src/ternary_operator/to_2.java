/*
Тернарный оператор
Иногда бывает, что ветвление можно записать короче, чем обычно.
Это возможно благодаря тернарному оператору ветвления.
Тернарным он называется потому что принимает 3 значения: одно условия и два результирующих значения.
редставим себе задачу: вывести минимальное число из двух.
Используя обычное ветвление, можно написать такой код:
*/
package ternary_operator;

import java.util.Scanner;
import java.util.Stack;

/*
public class to_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
*/
/*
Однако, его можно сократить с помощью такой конструкции:

(<условие>)  ? <значение, если истина> : <значение, если ложь>

Таким образом получим следующее:
*/
public class to_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a < b) ? a : b);
    }
}