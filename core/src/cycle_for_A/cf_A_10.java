/*
Совы нежные

Напишите программу, которая по введенному с клавиатуры числу выводит соответствующее число сов.
Картинка тетушки Совы состоит из символов. Размер одной картинки 5 на 11 символов.

:)\_____/(:
 {(@)v(@)}
 {|~- -~|}
 {/^'^'^\}
 ===m-m===
Между двумя соседними совами имеется пустая строка.

Входные данные
Задано целое неотрицательное число n.

Sample Input:
2

Sample Output:
:)\_____/(:
 {(@)v(@)}
 {|~- -~|}
 {/^'^'^\}
 ===m-m===

:)\_____/(:
 {(@)v(@)}
 {|~- -~|}
 {/^'^'^\}
 ===m-m===
 */
package cycle_for_A;
import java.util.Scanner;
public class cf_A_10 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        //указываем число (раз) необходимо вывести
        int q = sc.nextInt();
        //ну типо "СОВА"
        String w=":)\\_____/(:\n" +
                " {(@)v(@)}\n" +
                " {|~- -~|}\n" +
                " {/^'^'^\\}\n" +
                " ===m-m===";
        //условие вывода изображения Совы
        for(int i=0;i<q;i++){
            //выводим результат
            System.out.println(w+"\n");
        }
    }
}
