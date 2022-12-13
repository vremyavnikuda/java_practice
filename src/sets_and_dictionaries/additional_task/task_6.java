/*
Строка и Столбец
Вводятся 2 натуральных числа: n и m.
Затем вводится двумерный массив размером n*m.
Определите, есть в ней строка и столбец, произведение элементов которой равно 15.
Выведите на экран два ответа "YES/NO" построчно.

Sample Input:
3 4
1 1 3 5
4 6 7 8
-5 6 3 4

Sample Output:
YES
NO
*/
package sets_and_dictionaries.additional_task;
import java.util.Scanner;
public class task_6 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(),m= sc.nextInt();
        int [][]arrays=new int[n][m];
        boolean flag=false;
        boolean flag1=false;
        //int summa=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arrays[i][j]= sc.nextInt();
            }
        }
        int sum=1;
        for (int i=0;i< n;i++){
            for (int j=0;j<m;j++){
                sum*=arrays[i][j];
                if (j==m-1&&sum==15) {
                    flag=true;
                    break;
                }
            }
            sum=1;
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++) {
                sum *= arrays[j][i];
                if (j == n - 1 && sum == 15) {
                    flag1 = true;
                    break;
                }
            }
            sum = 1;
        }
        if (flag==true){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        if (flag1==true){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
