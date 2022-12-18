/*
Монотонное неубывание
Напишите функцию monneub,  которая принимает как аргумент массив целых чисел и находит длину максимального
монотонно не убывающего промежутка и выведите её на экран. Содержание функции main менять запрещено.

Sample Input:
10
1 2 3 1 3 4 5 1 1 3

Sample Output:
4
*/
package oop;

import java.util.Scanner;

public class function_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
            monneub(mas);
        }
    }

    //условие поиска максимальной последовательности
    static void monneub(int[] arr){
        int count = 1;
        int max = 1;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] >= arr[i]){
                count++;
                if(max < count)
                    max = count;
            }
            else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}