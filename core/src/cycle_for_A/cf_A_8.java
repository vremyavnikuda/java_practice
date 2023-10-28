/*
Средний возраст
В компьютер вводятся по очереди данные об имени и возрасте n учащихся класса.
Напишите программу, которая вычисляет средний возраст учащихся класса.

Входные данные
Вводится натуральное число n - количество человек в классе. Затем вводится n пар строчек.
Каждая пара состоит из имени и возраста ученика.

Выходные данные
Выведите единственное действительное число - ответ на задачу.

Sample Input 1:
3
Иван
15
Маша
14
Олег
13

Sample Output 1:
14.0

Sample Input 2:
2
Игорь
13
Ваня
12

Sample Output 2:
12.5
*/
package cycle_for_A;
import java.util.Scanner;

public class cf_A_8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        /*//вводим кол-во значений (в строку)
        String q= sc.nextLine();
        //переводим значение строки q в числовое значение n
        int n=Integer.parseInt(q);
        //создаем ряд переменных для работы с вводом
        String name ="name";double age=0;double summ=0;
        //условие
        for (int i=0;i<n;i++){
            //введите имя
            name= sc.nextLine();
            //введите возраст
            age= sc.nextDouble();
            sc.nextLine();
            //повтори результат нужное n раз
            summ+=age;*/
        //вводим кол-во значений
        int n= sc.nextInt();
        //переменная для суммирования результата
        double summ=0;
        //условие
        for(int i=0;i<n;i++){
            //введите строки (name)
            String name=sc.next();
            //введите строку лет(для получения стреднего результата)
            summ+= sc.nextInt();
        }
        //выводим результат
        System.out.println(summ/n);
    }
}
