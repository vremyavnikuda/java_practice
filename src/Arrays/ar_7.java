/*
Уникальные элементы
Дан список. Выведите те его элементы, которые встречаются в списке только один раз.
Элементы нужно выводить в том порядке, в котором они встречаются в списке.

Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.

Выходные данные
Выведите ответ на задачу.

Sample Input:
6
1
2
2
3
3
3

Sample Output:
1
*/
package Arrays;
import java.util.Scanner;
public class ar_7 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int arrays_l=in.nextInt();
        int []arrays=new int[arrays_l];

        //создаем условие заполнения массива
        for (int q=0;q<arrays_l;q++){
            arrays[q]=in.nextInt();
        }
        //создаем условие поиска не повторяющихся элементов массива
        //проходимся по каждом элементу массива
        for(int i=0;i<arrays.length;i++){
            //задаем логические значение
            boolean flag=true;
            //сравниваем по очереди каждое значение i ?=j
            for (int j=0;j<arrays.length;j++){
                if(arrays[i]==arrays[j]&&i!=j){
                    //если == то false
                    flag=false;
                    break;
                }
            //выводим результат
            }
            if (flag) {
                //выврлить нужно результат(каждый с новой строки)
                System.out.println(arrays[i]);
            }
            flag=true;
        }
    }
}
