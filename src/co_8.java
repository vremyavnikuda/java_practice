/*
* Високосный год.
По данному году определите, является ли он високосным.

Если год Високосный, то выведите "Yes", если же нет, то выведете "No"

Sample Input:

1993
Sample Output:

No
* */


import java.util.Scanner;

public class co_8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int q = sc.nextInt();
        if (q%100==0 && q%400==0){
            System.out.println("Yes");
        } else if (q%4==0&&q%100>0) {
            System.out.println("Yes");
        } else if (q%100==0) {
            System.out.println("No");
        }
        else{
            System.out.println("No");
        }
    }
}
