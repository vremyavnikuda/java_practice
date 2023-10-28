/*
Магический квадрат
Напишите программу, которая проверяет, является ли квадратная матрица магическим квадратом?

Входные данные
Программа получает на вход число n < 11, являющееся числом строк и столбцов в массиве.
Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.

Выходные данные
Программа должна выводить слово YES для магического квадрата и слово NO для не магического.

Sample Input 1:
3
2 7 6
9 5 1
4 3 8

Sample Output 1:
YES

Sample Input 2:
4
1 2 3 4
5 6 7 8
9 3 4 5
3 2 1 5

Sample Output 2:
NO
*/
package two_dimensional_arrays;
import java.util.Scanner;
public class tda_11 {
    public static void main (String[]args){

        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        String result=null;
        System.out.println("----------------------");
        //строка
        int count=0;
        // столбец
        int counter=0;
        //инициализировали массив
        int [][]array=new int[n][n];
        //условие заполнения массива
        for (int i =0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]= in.nextInt();
            }
        }
        //вкладываем значение строки_1 ,для сравнения
        for (int i=0;i< array[0].length;i++){
            counter+=array[0][i];
        }
        int Sn1=0;
        for (int i=0;i< array.length;i++){
            Sn1=0;
            for (int j=0;j< array[i].length;j++){
                Sn1+=array[i][j];
            }
            //проверяем равенство строк Sn1==counter
            if (Sn1==counter){
                count++;
            }
        }
        int Sn2=0;
        for (int i=0;i< array.length;i++) {
            Sn2 = 0;
            for (int j = 0; j < array[i].length; j++) {
                Sn2 += array[i][j];
            }
            //проверяем равенство столбцов Sn2==counter
            if (Sn2 == counter) {
                count++;
            }
        }
        int Sn_n1=0;
        for (int i=0;i< array.length;i++){
            for (int j=0;j< array[i].length;j++){
                if (i==j){
                    Sn_n1+=array[j][i];
                }
            }
        }
        if (Sn_n1==counter){
            count++;
        }
        //проверка равенства главной диагонали
        int Sn_n2=0;
        int max_length=array.length-1;
        for(int i=max_length;i>=0;i--){
            Sn_n2+=array[i][max_length-i];
            if (Sn_n2==counter){
                count++;
            }
        }
        //выводим результат
        if (count==n*2+2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
