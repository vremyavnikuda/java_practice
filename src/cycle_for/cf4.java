/*
Найдите Куб
Пользователь вводит слова до тех пор, пока не введёт "СТОП".
Необходимо выяснить, было ли среди введённых слов слово "Куб".
Если да, то выведите "YES", если нет, то  "NO".

Sample Input:
Привет
Я
люблю
рисовать
круги
и
Куб
Это
Прикольно)
СТОП

Sample Output:
YES
*/
package cycle_for;
import java.util.Scanner;
public class cf4 {
    public static void main (String[]args){
        /*Scanner sc = new Scanner(System.in);
        String q =sc.next();
        boolean is_q= false;
        for (String i ="СТОП";!i.equals(q);q= sc.next()){
            if (q=="Куб"){
                is_q=true;
            }
        }
        if(is_q==true) {
            System.out.println("Yes");
        }
        else if (is_q==false) {
            System.out.println("No");
        }*/
        Scanner sc =new Scanner(System.in);//модуль сканера
        int q =0;
        for (;true;){
            String q1= sc.nextLine();//зацикливаем бесконечный ввод данных
            if (q1.equals("Куб")){//если будет введен "Куб" ,то меняем значение переменной q==1
                q=1;//q==1
            }
            if (q1.equals("СТОП")){//Если введенно значение "СТОП" и q==1 ,то выводим значение "YES"
                if (1==q){//условие вывода "YES"
                    System.out.println("YES");//Вывод "YES"
                }
                else{//иначе
                    System.out.println("NO");//"NO"
                }
                break;//оставнавливаем цикл
            }
        }
    }
}
