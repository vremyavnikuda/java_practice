/*
Второклассная задача
У второклассников очень популярна следующая задача:

101 = 1

8181515 = 4

1111112 = 0

8888888 = 14

1010101 = 3

7000007 = ?

Преподавателю программирования в некоем Центре для одаренных детей так понравилась эта задачка,
что он решил именно ее использовать для проверки знаний математики 2-го класса у своих учеников.

Пусть первое число x, а соответствующее ему n

Входные данные
Единственное неотрицательное число x, не превышающее 101001.

Выходные данные
Выведите n.

Sample Input 1:
1010101

Sample Output 1:
3

Sample Input 2:
8888888

Sample Output 2:
14
*/
package string_array;
import java.util.Scanner;
public class sa_7 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //массив с числами
        char[] numbers= sc.nextLine().toCharArray();
        //счетчик
        int count=0;
        //цикл
        for (int i=0;i< numbers.length;i++){
            switch (numbers[i]){

                case('6'):
                    count++;
                    break;
                case ('9'):
                    count++;
                    break;
                case ('0'):
                    count++;
                    break;
                case ('8'):
                    count+=2;
                    break;
                default:
                    break;
            }
        }
        System.out.println(count);
    }
}
