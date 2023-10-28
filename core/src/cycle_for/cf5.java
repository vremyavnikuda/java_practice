/*Min и Max
Задача на поиск минимума и максимума. Пользователь вводит натуральное число n, затем n целых чисел.
Необходимо определить и вывести на экран минимальное и максимальное из них.
Обратите внимание, что в большинстве задач как минимальное и максимальное значения часто используются -2*109 и 2*109 соответственно.
Но в олимпиадных задачах всегда смотрите на ограничения по числам (в них всегда оговорены границы, в которых будут лежать значения переменных).

Sample Input:
5
6
10
-7
13
4

Sample Output:
-7
13
*/
package cycle_for;

import java.util.Scanner;

public class cf5 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        //переменная ввода данных
/*
        //вводим модификатор и тип MAX MIN
        int q = sc.nextInt();int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i=0;i<q;i++){
            int q1= sc.nextInt();//указываем условие ввода данных
            //ищем максмимальное значение
            if (q1>max)max=q1;
            //ищем минимальное значение
            if (q1<min)min=q1;
        }
        //выводим результат
  */
        int q = sc.nextInt();int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        /*
        int q_min=0;//минимум
        int q_max=0;//максимум
        //создаем массив хранения чисел
        int []array_nums=new int [q];//обозначаем что там будет храниться 5 данных q
        for (int i=0;i<q;i++){
            //зацикливаем бесконечный ввод данных до ==q
            array_nums[i]= sc.nextInt();
        }
        //добавляем максимальное и минимальное значение в начало
        q_min=array_nums[0];
        q_max=array_nums[0];
        for (int i:array_nums){
            //сравниваем значения
            if (i<q_min)q_min=i;
            if (i>q_max)q_min=i;
        }
        //выводим полученные значения
        System.out.println(q_min);
        System.out.println(q_max);
        */
        for (int i=0;i<q;i++){
            int q1= sc.nextInt();
            if (q1>max)max=q1;
            if (q1<min)min=q1;
        }

        System.out.println(min);
        System.out.println(max);
    }
}
