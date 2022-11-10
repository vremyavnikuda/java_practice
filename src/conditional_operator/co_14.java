package conditional_operator;/*Количество цифр 2
Вводится целое число n (0 < n < 1000). Определите, сколько в нём цифр. Выведите ответ на экран.

Sample Input 1:

8
Sample Output 1:

1
Sample Input 2:

23
Sample Output 2:

2*/


import java.util.Scanner;

public class co_14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int length=1;
        if (q>=1000){
            length+=3;
            q/=1000;
        }
        if (q>=100){
            length+=2;
            q/=100;
        }
        if (q>=10){
            length+=1;
        }
        System.out.println(length);
    }
}
