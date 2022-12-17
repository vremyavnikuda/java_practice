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