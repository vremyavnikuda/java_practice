package conditional_operator;/*Количество цифр 1
Вводится целое число n (0 < n < 1000). Определите, является ли оно двузначным? Выведите в ответ "Yes"/"No".

Sample Input 1:

8
Sample Output 1:

No
Sample Input 2:

23
Sample Output 2:

Yes*/


import java.util.Scanner;

public class co_13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        if (q>9&&q<100){System.out.print("Yes");}
        else {System.out.print("No");}
    }
}
