package cycle_B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//ну тут на самом деле сложно объяснить как это сделано
//если в общих чертах ,то через спиcки и редактирование этих списков через цикл while
public class cf_B_6 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> myList=new ArrayList<>();
        int n =sc.nextInt(),k =sc.nextInt();
        int i;
        if (n==0)
            System.out.println("0");
        else{
            while(n!=0){
                i=n%k;
                String t=Integer.toString(i);
                myList.add(t);
                n=n/k;
            }
            int size=myList.size();

            while(size>0){
                System.out.print(myList.get(size-1));
                size--;
            }
        }
    }
}
