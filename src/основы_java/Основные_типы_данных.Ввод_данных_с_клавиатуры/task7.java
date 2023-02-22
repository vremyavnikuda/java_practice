package основы_java.Основные_типы_данных.Ввод_данных_с_клавиатуры;

/*
Дано произвольное положительное натуральное число. Найдите его последнюю цифру.

Sample Input:
345

Sample Output:
5
*/
import java.util.Scanner;

public class task7 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        System.out.println(i%10);
    }
}
