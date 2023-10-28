/*
Повторение Строк
Напишите программу, которая считает строку и определит, есть ли в ней именно слово "повторение".
Слово может быть написано как с маленькой, так и с большой буквы.
Гарантируется, что знаки препинания из текста были удалены.
На экран выведите YES/NO.

Sample Input:
Повторение мать учения

Sample Output:
YES
*/
package list;
import java.util.Scanner;
public class l_0 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String[]arrays=sc.nextLine().toLowerCase().split(" ");
        boolean flag=false;
        for (int i=0;i<arrays.length;i++){
                if (arrays[i].equals("повторение")){
                    flag=true;
            }
        }
        if (flag){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
