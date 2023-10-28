package cycle_B;

import java.util.Scanner;

public class cf_B_4 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        //переменные ввода основной информации
        int n= sc.nextInt(),k= sc.nextInt();
        //условие(делаем сравнение по условию ,что k>n, из этого следует ,что можно из большего отнять меньшее и узнать
        // больше ли оно в 2 раза)
        if ((k-n)>=n){
            //если да ,то + это значение к исходному году
            System.out.println(2020+((k-n)-n));
        // если нет ,то никогда
        }else System.out.println("Никогда");
    }
}
