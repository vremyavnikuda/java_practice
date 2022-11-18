/*
Нечётные цифры
Составьте программу, которая в одну строку через пробел выводит все нечетные цифры.

Sample Input:

Sample Output:
1 3 5 7 9
*/
package cycle_for_A;

import java.util.Scanner;

public class cf_A_4 {
    public static void main (String[]args){
        //исходное значение (диапозон)
        int q=10;
        //условие (если i==1 и i<10,тогда к i+2
        for (int i=1;i<10;i+=2){
            //вывести результат
            System.out.print(i+" ");
        }
    }
}
