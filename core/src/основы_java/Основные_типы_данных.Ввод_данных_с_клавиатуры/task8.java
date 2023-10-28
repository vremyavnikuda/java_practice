package основы_java.Основные_типы_данных.Ввод_данных_с_клавиатуры;

/*
Сумма цифр
Дано трехзначное число. Найдите сумму его цифр.

Sample Input 1:
179

Sample Output 1:
17

Sample Input 2:
300

Sample Output 2:
3
*/
import java.util.Scanner;

public class task8 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(((a/10)/10)+((a/10)%10)+(a%10));
    }
}
