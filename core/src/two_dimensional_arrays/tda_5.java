package two_dimensional_arrays;

import java.util.Scanner;

public class tda_5 {
    public static void main (String[]args){
        //создали массивы и задали им длинну 
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int [][]arrays=new int[n][n];
        
        //создаем условие заполнения массивов
        //надо проверить теперь симметричны относительно главной диагонали они ?????
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                //заполнили их 
                arrays[i][j]= sc.nextInt();
            }
        }
        //Заведем 2 переменные которые будут сравниваться (симметричность массива)
        int q1=0,q2=0;
        //задаем условие проверки симметричности
        for(int a=0;a<arrays.length;a++){
            for(int j=0;j<arrays.length;j++){
                //Если a<j q1+=arrays[a][j]
                if(a<j) {
                    q1 =q1+arrays[a][j];
                    continue;
                }
                //Если a>j q2+=arrays[a][j]
                if(a>j){
                    q2=q2+arrays[a][j];
                }
            }
        }
        //Сравниваем полученные значения
        //Если равны то "YES"
        if (q1==q2){
            System.out.println("YES");
        }
        //Иначе "NO"
        else {
            System.out.println("NO");
        }
    }
}
