/*
Подсчёт без учёта регистра
Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита.
Найдите, сколько раз в тексте встречается введённый символ в любом регистре.
Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.

Sample Input:

Good morning my dear friend. My fish.
m

Sample Output:
3
*/
package string_array;
import java.util.Scanner;
public class sa_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //получаем строку для поиска
        String text= sc.nextLine();
        //получаем букву которую необходимо найти
        String text1=sc.nextLine();
        //задаем счетчик сколько раз найдена буква в строке
        int count=0;
        //преобразовываем строку в массив
        char[]arrays=text.toCharArray();
        //тоже самое делаем и с буквой которую нужно найти
        char[]arrays1=text1.toCharArray();
        //задаем условие поиска
        for (int i=0;i<arrays.length;i++){
            for (int j=0;j<arrays1.length;j++){
                //если массив символов строк == массиву символов буквы
                if (arrays[i]==arrays1[j]){
                    //счетчик +1
                    count++;
                }
            }
        }
        //вывести результат count
        System.out.print(count);
    }
}
