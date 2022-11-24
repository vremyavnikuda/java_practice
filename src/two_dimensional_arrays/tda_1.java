package two_dimensional_arrays;

import java.util.Scanner;

public class tda_1 {
    public static void main (String[]args){
        Scanner in =new Scanner(System.in);
        //длинна массива
        int size= in.nextInt();
        //инициализация первого массива
        double []array_1=new double[size];
        //инициализация второго массива
        double []array_2=new double[size];
        //условие заполнения первого массива
        for (int i=0;i<array_1.length;i++){
            array_1[i]= in.nextDouble();
        }
        //условие заполнения второго массива
        for (int i=0;i<array_2.length;i++){
            array_2[i]= in.nextDouble();
        }

        //массив для сумм (двух массивов)
        double[]sum_arrays=new double[size];
        //условие суммирование массивов
        for (int i=0;i<size;i++){
            //суммируем массивы и кладем результат в массив [sum_arrays]
            sum_arrays[i]=array_1[i]+array_2[i];
        }
        //Вывести массив [sum_arrays]
        for (int i =0;i<sum_arrays.length;i++){
            System.out.println(sum_arrays[i]);
        }
    }
}
