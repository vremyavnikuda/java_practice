package oop.Решение_задач_с_использованием_функций;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class task_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] mas = new Integer[n];

        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        sort(mas);
        for (int i : mas)
            System.out.print(i + " ");
    }
    public static void sort(Integer[] mas) {
        //стандартный метод sort из класса Arrays (дальше укажем компаратор для бы отсортировать массив по убыванию)
        Arrays.sort(mas, Collections.reverseOrder());
    }
}
