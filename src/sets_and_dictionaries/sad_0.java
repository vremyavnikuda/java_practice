package sets_and_dictionaries;

import java.util.ArrayList;
import java.util.Scanner;

public class sad_0 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<String>();
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            list.add(String.valueOf(i));
        }
        int k= sc.nextInt();
        for (int i=0;i<k;i++){
            int q= sc.nextInt();
            int w= sc.nextInt();
            list.add(w, String.valueOf(q));
        }
        String finalx=String.join(" ",list);
        System.out.print(finalx);
    }
}
