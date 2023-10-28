package conditional_operator;/* Яша плавает в бассейне
Яша плавал в бассейне размером N×M метров и устал. В этот момент он обнаружил, что находится на расстоянии x метров от одного из длинных бортиков (не обязательно от ближайшего) и y метров от одного из коротких бортиков. Какое минимальное расстояние должен проплыть Яша, чтобы выбраться из бассейна на бортик?

Входные данные
Программа получает на вход числа N, M, x, y.

Выходные данные
Программа должна вывести число метров, которое нужно проплыть Яше до бортика.

Sample Input 1:

23
52
8
43
Sample Output 1:

8
Sample Input 2:

18
90
3
63
Sample Output 2:

3
*/


import java.util.Scanner;

public class co_11 {
    public static void main(String[] args)
    {
        /*Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),M=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
        int x1,y1;
        //определяем короткий и длинный бортик
        //и в зависимости от того какой длинее
        //считаем 2 расстояния на которые нам не инзвестны
        if (N>M){
            x1=M-x;
            y1=N-y;
        }
        else{
            x1=N-x;
            y1=M-y;
        }
        //Выявляем наименьшее росстояние в соответствии с известными
        //нам на сейчас инструментами
        if ((x<x1)&&(x<y)&&(x<y1)){
            System.out.println(x);
        } else if ((x1<x)&&(x1<y)&&(x1<y1)) {
            System.out.println(x1);
        } else if ((y<x)&&(y1<x1)&&(y<y1)) {
            System.out.println(y);
        } else if ((y1<x)&&(y1<x1)&&(y1<y)) {
            System.out.println(y1);
        }*///первое решение
        /* Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (N>=M) {
            if (M-x<=x) {
                if ((M-x<=y) && (M-x<=N-y)) {
                    System.out.println(M-x);
                } else {
                    if (N-y<=y) {
                        System.out.println(N-y);
                    } else {
                        System.out.println(y);
                    }
                }
            } else {
                if ((x<=y) && (x<=N-y)) {
                    System.out.println(x);
                } else {
                    if (N-y<=y) {
                        System.out.println(N-y);
                    } else {
                        System.out.println(y);
                    }
                }
            }
        } else {
            if (N-x<=x) {
                if ((N-x<=y) && (N-x<=M-y)) {
                    System.out.println(N-x);
                } else {
                    if (M-y<=y) {
                        System.out.println(M-y);
                    } else {
                        System.out.println(y);
                    }
                }
            } else {
                if ((x<=y) && (x<=M-y)) {
                    System.out.println(x);
                } else {
                    if (M-y<=y) {
                        System.out.println(M-y);
                    } else {
                        System.out.println(y);
                    }
                }
            }
        }*///второе решение
    }
}
