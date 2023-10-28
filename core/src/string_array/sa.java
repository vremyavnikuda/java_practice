/*
Подсчёт c учётом регистра
Вводится строка, найдите, сколько раз в ней встречается буква "f".
Подсчитайте количество вхождений только "маленькой буквы".

Sample Input:
Good morning my dear friend. This is fish.

Sample Output:
2
*/
package string_array;
import java.util.Scanner;
public class sa {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //получаем строку от пользователя
        String text= sc.nextLine();
        //задем счетчик поиска
        int count=0;
        //переводим строки в массив символов
        char[]arrays=text.toCharArray();
        //задаем условие писка определенного символа
        for (int i=0;i<arrays.length;i++){
            //если array[i]=='f'(если индекс массива==символу f)
            if (arrays[i]=='f'){
                //увеличиваем счетчик
                count++;
            }
        }
        //получаем сколько раз увеличился счетчик
        System.out.print(count);
    }
}
