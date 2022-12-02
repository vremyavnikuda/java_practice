package arrays_sample_tasks;

import java.util.Scanner;

public class arrst_6 {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        //Задаем длинну массива
        int n= in.nextInt();
        //Инициализируема массив
        int[] array =new int[n];

        //Создаем условие заполнение массива
        for (int i=0;i<array.length;i++){
            array[i]= in.nextInt();
        }

        //Сколько будет запросов к программе(z)
        int z= in.nextInt();

        //Массив с результатами
        String[]result=new String[z];

        //Запросы и условие
        for (int i=0;i<z;i++){

            //Вводим нужные нам индексы
            int a = in.nextInt(), b = in.nextInt();

            //Задаем условие вывода и исключение
            if(a >= 0 && a < n && b >= 0 && b < n){
                int sum_ab = array[a] + array[b];

                //переводим результат в строки и кладем его в массив
                result[i]=Integer.toString(sum_ab);
            }
            //Если условие не выполняется "Error"
            else{
                result[i]="Error";
            }
        }
        //Выводим общий результат
        for (int i= 0;i<z;i++){
            System.out.println(result[i]);
        }
    }
}
