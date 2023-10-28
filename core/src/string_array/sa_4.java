/*
Палиндром
Вводится строка. определите, является ли она палиндромом.
Напоминаю,  что палиндром - это слово/строка, которая читается одинаково слева направо и справа налево.
В ответ выведите YES/NO.

Sample Input 1:
Тот

Sample Output 1:
YES

Sample Input 2:
А роза упала на лапу азора

Sample Output 2:
YES

Sample Input 3:
Аргентина манит негра

Sample Output 3:
YES

Sample Input 4:
sffgadhgcs v

Sample Output 4:
NO
Sample Input 5:
ttt 4t tt

Sample Output 5:
YES
*/
package string_array;
import java.util.Arrays;
import java.util.Scanner;
public class sa_4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        //исходная строка с преобразованием
        //удаляем лишнее и приводим к буквам нижнего регистра
        String text = sc.nextLine().toLowerCase().replaceAll(",","");
        //инициализируем массив(String),сплитуем и вкладываем в него строку text
        String [] text_clear= text.split(" ");
        //создаем строку text_multiply (дублирующая строка )
        //которую в дальнейшем приведем к массиву и развернем (будем сравнивать с другим массивом)
        String text_multiply="";
        //повесили флаг ==false
        boolean flag=false;

        //вкладываем значения из массива text_clear в строку text_multiply
        for (int i=0;i<text_clear.length;i++){
            text_multiply=text_multiply.concat(text_clear[i]);
        }

        //инициализируем два массива(Char).
        // В первый вкладываем в него значения text_multiply
        char[]text_char=text_multiply.toCharArray();
        //А во второй вложим тот же самый текст ,только в revers
        //длинна строки text_char
        int tc_length=text_char.length;
        char[]text_char_revers=new char[text_multiply.length()];
        //revers char[]text_char для text_char_revers

        for (int i=tc_length-1;i>=0;i--){
            text_char_revers[tc_length-1-i]=text_char[i];
        }
        //сравниваем 2 массива на палиндромность
        for (int i=0;i<tc_length;i++){
            if (text_char_revers[i]==text_char[i]){
                flag=true;
            }else {
                flag=false;
                break;
            }
        }
        //условие вывода
        if (flag){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}