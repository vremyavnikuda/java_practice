package two_dimensional_arrays.additional_task;
import java.util.Scanner;
public class at_10 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(),m= sc.nextInt();
        System.out.println("####################################");
        int [][]arrays=new int[n][m];
        //переменные
        int count=0;
        int max_Sport=0;

        //условие заполнения массива
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arrays[i][j]= sc.nextInt();
            }
        }
        //Ищем максимальное значение массива
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (max_Sport<arrays[i][j]){
                    max_Sport=arrays[i][j];
                }
            }
        }
        //а так же сколько раз оно повторяется
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                //max_Sport==максимальное значение
                if (max_Sport==arrays[i][j]){
                    //сколько раз оно повторяется
                    count+=1;
                    break;
                }
            }
        }
        //выводим сколько раз повторяется максимальное значение массива
        System.out.println(count);
        //условие вывода индексов максимального значения
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (max_Sport==arrays[i][j]){
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
}
