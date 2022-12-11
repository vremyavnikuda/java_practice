/*
Количество уникальных чисел
Вводится число n, затем n целых чисел. Определите, сколько различных чисел было введено.

Sample Input:
7
1 1 2 2 2 3 3

Sample Output:
3
*/
package sets_and_dictionaries;
import java.util.HashSet;
import java.util.Scanner;

public class sad_4 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer>numbers=new HashSet<Integer>();
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            numbers.add(sc.nextInt());
        }
        System.out.println(numbers.size());
    }
}
