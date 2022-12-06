package list;
import java.util.ArrayList;
import java.util.Scanner;

public class l_2 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(),m= sc.nextInt();
        String text= sc.next();
        ArrayList<String> list=new ArrayList<>(n);
        for (int i=0;i<n;i++){
            list.add(String.valueOf(i));
        }
        list.add(m,text);
        String finaltext=String.join(" ",list);
        System.out.print(finaltext);
    }
}
