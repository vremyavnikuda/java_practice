/*
Уберите лишнее
Вводится строка. уберите из неё все символы, которые не являются ни цифрой, ни буквой, ни пробелом.

Sample Input:

Привет, это предложение, в котором %есть лишние ;символы. 45
Sample Output:

Привет это предложение в котором есть лишние символы 45
*/
package string_array;
import java.util.Scanner;
public class sa_3 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //получаем строку которую нужно корректировать
        String text= sc.nextLine();
        //преобразовываем ее к массиву символов
        char []arrays= text.toCharArray();
        //задаем условие для символов которые нужно оставить
        for (int i=0;i<arrays.length;i++){
            //определяем ,являются ли символы массива цифрами,буквами и пробелами
            if (Character.isLetterOrDigit(arrays[i])||arrays[i]==' ') {
                //получаем конечный результат
                System.out.print(arrays[i]);
            }
        }
    }
}
/*
При данном способе ,в результате у меня почему то приходят корейские символы
кто нибудь может подсказать почему ?
String text= sc.nextLine();
char []arrays= text.toCharArray();
char[] arrays_correct=text.toCharArray();
for (int i=0;i<arrays.length;i++){
    for (int j=0;j<arrays_correct.length;j++) {
        if (Character.isLetter(arrays[i])) {
            arrays_correct[j] += arrays[i];
        }
        if (Character.isDigit(arrays[i])) {
            arrays_correct[j] += arrays[i];
        }
        if(arrays[i]==" "){
            arrays_correct[j]+=arrays[i]
        }
        System.out.println(arrays_correct)
    }
}
*/