/*Три равные строки
С клавиатуры построчно вводятся три строки. Необходимо определить, все ли он равны. Если да, то вывести "Yes", в противном случае - "No".

Sample Input 1:

String
String
String
Sample Output 1:

Yes
Sample Input 2:

String
String
Not String
Sample Output 2:

No */

import java.util.Scanner;

public class co_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();
        String w = sc.nextLine();
        String e = sc.nextLine();
        if (q.equals(w) && (w.equals(e))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}