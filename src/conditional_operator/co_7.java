package conditional_operator;/*Большее из 3
Вводится 3 целых числа, выведите большее из них

Sample Input:

1 2 3
Sample Output:

3
*/
import java.util.Scanner;

public class co_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(), w = sc.nextInt(),e = sc.nextInt();
        if (q>w && q>e){
            System.out.println(q);
        }
        else if (w>q && w>e){
            System.out.println(w);
        }
        else{
            System.out.println(e);
        }
    }
}
