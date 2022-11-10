package conditional_operator;/*
Две равные строки
С клавиатуры построчно вводятся три строки. Если среди них есть ровно две равные строки то вывести "Yes",
в противном случае - "No".

Sample Input 1:

String
Hello!
String
Sample Output 1:

Yes
Sample Input 2:

hello
String
Not String
Sample Output 2:

No
* */


import java.util.Scanner;

public class co_9 {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String q=sc.nextLine(),w=sc.nextLine(),e=sc.nextLine();
        if ((q.equals(w)&&!w.equals(e))||(w.equals(e)&&!e.equals(q))||(e.equals(q)&&!q.equals(w)))
        {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
