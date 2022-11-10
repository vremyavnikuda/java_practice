/*Странные часы
У Пети очень странные часы. Они считают время не так, как остальные - они отсчитывают количество секунд от начала суток.

Как-то раз Петя уснул, будильник, не сработал, но взглянув на часы, Петя не смог понять, успел ли он на уроки, или опоздал. Если Петя проснулся ровно в ту секунду, когда должен был, или раньше, то он успевает на учёбу.

Входные данные
На вход даётся 3 целых числа: h, m - время, в которое Пете надо было проснуться, и x - время, которое показывают его часы.

Выходные данные
Выведите слово "Успел", если Петя не проспал, или "Опоздал", если Петя не смог проснуться вовремя.

Sample Input 1:

12 30 44321
Sample Output 1:

Успел
Sample Input 2:

6 30 28765
Sample Output 2:

Опоздал*/
import java.util.Scanner;

public class co_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );
        int q = sc.nextInt(), w = sc.nextInt(), e = sc.nextInt();
        // int r, t = ((e / 3600) + " " + (e - 23 * 3600) / 60);
        if (q>=0 && q<=24 && w>=0 &&w<=60 )
        {
            int r=((q*60)*60)+(w*60);
                if (e<=r)
                {
                    System.out.println("Успел");
                }
                else{
                    System.out.println("Опоздал");
                }
        }
        /*int r = e / 3600;
        int t = (e - (r * 3600)) / 60;
        if ((q >= r) && (w >= t)) {
            System.out.println("Успел");
        } else {
            System.out.println("Опоздал");
        }*/
    }
}
