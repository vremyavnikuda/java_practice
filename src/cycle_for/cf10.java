/*
Найдите Куб 2.0
Пользователь вводит слова до тех пор, пока не введёт "СТОП".
Среди введённых слов могут быть слова - паразиты, а именно: "'ээээ" или "потом".
Слова-паразиты не считаются нормальными словами.

Необходимо выяснить, было ли среди введённых слов слово "Куб".
Если да, то выведите, каким по счёту нормальным словом оно было введено.
В противном случае выведите на экран слово "NO".

Sample Input 1:
Привет
ээээ
Я
люблю
рисовать
круги
и
Куб
Это
Прикольно)
СТОП

Sample Output 1:
7

Sample Input 2:
Привет
ээээ
Я
потом
ээээ
в
Куб
СТОП

Sample Output 2:
4
*/
package cycle_for;
import java.util.Scanner;
public class cf10 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        String q1=sc.nextLine();
        //логические условие
        boolean q= false;
        //счетчик если есть слова паразиты
        int count=0;
        //счетчик вывода каким по счету будет строка (Куб)
        int q_sum=0;
        //условие
        for (String i="СТОП";!i.equals(q1);q1=sc.nextLine()){
            //Если в строку q1 было введено "ээээ"или"потом"==отнимает от счетчика -1
            //за каждое слово
            if (q1.equals("ээээ")|| q1.equals("потом")){
                count--;
            }
            //другие ввеленные слова помимо нашего исключения (считаем ++)
            count++;
            //если q1==Куб в любом случае назначаем (TRUE)
            if (q1.equals("Куб")) {
                //переназначем q на true
                q = true;
                // прибавляем к общему счетчику q_sum +count
                q_sum += count;
            }
        }
        //блок вывода информации
        //если q==true:выводим каким по счету будет строка "Куб"
        if (q==true){
            System.out.println(q_sum);
        }
        //если условия не выполнились,то выводим сообщение "No"
        else if (q==false){
            System.out.println("NO");
        }
    }
}
