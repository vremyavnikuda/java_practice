package two_dimensional_arrays;

import java.util.Scanner;

public class tda_10 {
    public static void main (String[]args){
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        //исходный массив
        int [][]array=new int[n][n];
        //условие заполнения массива
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]= in.nextInt();
            }
        }
        //второй массив который будем запонять данными ,но отражением его относительно главной
        //диагонали(из левого верхнего угла,до правого нижнего)
        int [][]array_native=new int[n][n];
        //условие отражения массива
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array_native[j][i]=array[i][j];
            }
        }
        //выводим отраженный массив(через пробел)
        for (int i=0;i<array_native.length;i++){
            for (int j=0;j<array_native[i].length;j++){
                System.out.print(array_native[i][j]+" ");
            }
            System.out.println();
        }
    }
}
