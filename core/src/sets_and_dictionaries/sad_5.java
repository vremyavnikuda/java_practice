/*
Встречалось ли число раньше?
Вводится число n, затем n целых чисел.
Для каждого числа выведите слово YES (в отдельной строке), если это число ранее встречалось
в последовательности или NO,  если не встречалось.

Sample Input:
6
1 2 3 2 3 4

Sample Output:
NO
NO
NO
YES
YES
NO
*/
package sets_and_dictionaries;
import java.util.HashSet;
import java.util.Scanner;

public class sad_5 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer>numbers=new HashSet<Integer>();
        int n= sc.nextInt();
        for (int i=0;i<n;i++) {
            boolean q = numbers.add(sc.nextInt());
            if (q) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
