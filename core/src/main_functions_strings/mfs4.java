/*
Просто соедини их
Вводится число n, затем n строчек, которые необходимо соединить.
После вводится ещё одна строка - которая должна быть в качестве разделителя.
Выведите одну строку - все введённые выше слова через разделитель.

Sample Input:
5
Привет
это
курсы
по
Java
-

Sample Output:
Привет-это-курсы-по-Java
*/
package main_functions_strings;
import java.util.Scanner;
public class mfs4 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int q= sc.nextInt();
        String[]array=new String[q];
        for (int i=0;i<q;i++){
            array[i]= sc.next();
        }
        String q_1= sc.next();
        String str_finish=String.join(q_1,array);
        System.out.println(str_finish);
    }
}
