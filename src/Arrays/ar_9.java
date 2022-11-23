/*
Кубы 2
Вводятся числа a и b.
Создайте массив, в котором будут храниться кубы чисел от a до b.
Затем вводится число n и n чисел после него.
Используя данные из массива найдите кубы этих.
Если вводится число, не принадлежащее заданному диапазону, выведите на экран слово "Error".

Sample Input:
5
10
4
5
8
-1
5

Sample Output:
125
512
Error
125
*/
package Arrays;
import java.util.Scanner;
public class ar_9 {
    public static  void main (String[]args){
        Scanner in =new Scanner(System.in);
        //Создаем две переменные которые определят наш диапазон
        int a = in.nextInt();
        int b = in.nextInt();
        //создаем массив в котором будут храниться кубы чисел от (q) до (w)
        int arrays[] =new int [b-a+1];
        //заполняем массив кубами чисел от (a) до (b)
        for(int i=0;i< arrays.length;i++){
            //возводим в куб каждое число от a до b, поочередно
            arrays [i]=(int)Math.pow(a,3);
            a++;
        }
        //Переменная (n) отвечает за кол-во чисел, которые будут введены после него
        int n = in.nextInt();
        //Задаем булевое значение флагу ==false
        boolean flag=false;
        //Задаем условие при котором нужно будет ввести кол-во чисел соответствующее переменной (n)
        for(int i=0;i<n;i++){
            //Вводим (nN) число (n)-раз
            int nN= in.nextInt();
            //Задаем условие возведение в степень чисел (nN) и сравнение их с уже имеющимся
            //массивом кубов [arrays]
            for (int j=0;j<arrays.length;j++){
                if(Math.pow(nN,3)==arrays[j]){
                    //Если да ,то flag=true
                    flag=true;
                    break;
                }
                //если нет то flag=false
                else flag=false;
            }
            //Вывод итоговый результат поиска
            System.out.println(flag?(int)Math.pow(nN,3):"Error");
        }
    }
}
