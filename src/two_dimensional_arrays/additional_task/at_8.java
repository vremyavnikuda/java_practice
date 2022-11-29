package two_dimensional_arrays.additional_task;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class at_8 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int b= sc.nextInt();
        int counter=0;
        int count=0;
        System.out.println("------------------");

        int [][]array=new int[b][b];
        for (int i=0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                array[i][j]= sc.nextInt();
            }
        }
        for (int i=0;i< array[0].length;i++){
            counter+=array[0][i];
        }

        int sn_1=0;
        for (int i=0;i< array.length;i++){
            sn_1=0;
            for(int j=0;j<array[i].length;j++){
                sn_1+=array[i][j];
            }
            if (sn_1==counter){
                count++;
            }
        }
        int sn_2=0;
        for (int i=0;i< array.length;i++){
            sn_2=0;
            for (int j=0;j< array[i].length;j++) {
                sn_2 += array[i][j];
            }
            if (sn_2==counter){
                count++;
            }
        }
        int sn_n1=0;
        for (int i=0;i< array.length;i++){
            for (int j=0;j< array[i].length;j++){
                if(i==j){
                    sn_n1+=array[j][i];
                }
            }
        }
        if (sn_n1==counter){
            count++;
        }
        int sn_n2=0;
        int max_length= array.length-1;
        for (int i=max_length;i>=0;i--){
            sn_n2+=array[i][max_length-i];
            if (sn_n2==counter){
                count++;
            }
        }
        if (count==b*2+2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
