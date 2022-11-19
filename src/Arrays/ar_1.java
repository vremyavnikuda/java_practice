package Arrays;

import java.util.Scanner;

public class ar_1 {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        //вводим переменную с дальностью массива
        int n=1001;
        //инициализируем массив
        int[] arrays=new int [n];
        //создаем условие заполнения массива
        for(int i=1;i<n;i++){
            //заполняем массив кубами числа от 1 до 1000
            arrays[i]=i*i*i;
        }
        //выводим 2 числа из диапозона массива
        int q= in.nextInt(),w= in.nextInt();
        //выводим результат
        System.out.println(arrays[q]);
        System.out.println(arrays[w]);
    }
}
