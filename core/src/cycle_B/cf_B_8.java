/*
Детский Сад
Для постановки Сказки красная шапочка в детском саду "Солнышко" было решено выбрать самого маленького по росту ребёнка на роль красной шапочки и самого большого на роль волка.

На вход программе даётся число n, затем 2*n  строк. Каждая пара строк - Имя ребёнка и его рост.
Выведите  на разных строках два имени: ребёнка, который будет играть красную шапочку и ребёнка, который будет играть волка.
Если детей одного наименьшего или наибольшего роста несколько, то выберите первого из встретившихся. Гарантируется, что все имена различны и есть минимум 1 ребёнок.

В силу специфики работы Scanner для считывания строки используйте именно sc.next();

Sample Input 1:
3
Вася
130
Маша
110
Коля
140

Sample Output 1:
Маша
Коля

Sample Input 2:
4
Алина
120
Вася
140
Маша
110
Коля
140

Sample Output 2:
Маша
Вася
*/
package cycle_B;
import java.util.Scanner;
public class cf_B_8 {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        //сколько будет значений (Имя/Рост)
        int n = in.nextInt();
        //Максимальный рост
        int height_max=0;
        //Минимальный рост
        int height_min=0;
        //Имя с самым высоким ростом
        String nameMax="";
        //Имя с самым низким ростом
        String nameMin="";
        //переменная с ростом
        int height=0;
        int a=0;
        /*int height_max=Integer.MAX_VALUE,height_min=Integer.MIN_VALUE;
            for (int i=0;i<n;i++){
            String in_name= in.next();
            int in_height=in.nextInt();
            //if (in_height<height_max)height_max=in_height;
            //if(in_height>height_min)height_min=in_height;

        }*/
        if (n==1){
            String name=in.next();
            nameMin=name;
            nameMax=name;
        }
        if(n>1){
            for(;n>=1;n--){
                String name=in.next();
                a=height;
                height=in.nextInt();

                if (height>height_max&&height>a){
                    height_max=height;
                    nameMax=name;
                }
                if (height<height_max&&height<a){
                    height_min=height;
                    nameMin=name;
                }
            }
        }
        System.out.println(nameMin);
        System.out.println(nameMax);
    }
}
