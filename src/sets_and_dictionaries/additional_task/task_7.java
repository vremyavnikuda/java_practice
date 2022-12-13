/*
Люблю букву А!
Вводится строка.
Определите, сколько слов в ней начинается с маленькой или большой буквы а (только русской).
Словом считается любая последовательность символов, не содержащая пробелов.

Sample Input:
Алёнка, привет. Выходи к арке

Sample Output:
2
*/
package sets_and_dictionaries.additional_task;
import java.util.Scanner;
public class task_7 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int count = 0;
        for (int i = 0; i<str.length; i++){
            if (str[i].substring(0,1).equals("а") || str[i].substring(0,1).equals("А")){
                count ++;
            }
        }
        System.out.print(count);
    }
}
