/*
Кратные 3
Последовательность состоит из натуральных чисел и завершается числом 0.
Определите максимальный элемент кратный 3. если такого элемента нет,
то выведите на экран "404".

Числа, следующие за числом 0, считывать не нужно.

Sample Input:
1 2 3 4 5 6 7 6 5 9 4 3 2 4 5 6 8 10 0

Sample Output:
9
*/
package sets_and_dictionaries.additional_task;
import java.util.Scanner;
public class task_3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int max = 0, x;
        do
        {
            x = sc.nextInt();
            if ( x%3 == 0 && x > max)
                max = x;
        }
        while ( x != 0 );
        System.out.print( max !=0 ? max : 404 );
    }
}
