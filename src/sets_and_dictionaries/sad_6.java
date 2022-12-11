/*
Количество слов
Дан текст: в первой строке записано число строк, далее идут сами строки.
Определите, сколько различных слов содержится в этом тексте.

Словом считается последовательность непробельных символов идущих подряд, слова разделены
одним или большим числом пробелов или символами конца строки.

Sample Input:
4
She sells sea shells on the sea shore;
The shells that she sells are sea shells I'm sure.
So if she sells sea shells on the sea shore,
I'm sure that the shells are sea shore shells.

Sample Output:
19
*/
package sets_and_dictionaries;
import java.util.HashSet;
import java.util.Scanner;

public class sad_6 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        HashSet<String>str=new HashSet();
        int n= sc.nextInt();
        sc.nextLine();
        String q="";
        for (int i=0;i<n;i++){
            q= sc.nextLine();
            String[]words=q.split(" ");
            for (int j=0;j< words.length;j++) {
                str.add(words[j]);
            }
        }
        System.out.println(str.size());
    }
}
