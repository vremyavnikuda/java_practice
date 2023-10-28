/*
Выпуклый многоугольник
Вводится число n (n >= 3), затем даются координаты n точек построчно.
Найдите периметр этого многоугольника и его площадь. Выведите ответ построчно.
Округлите ваш ответ до сотых.

Sample Input:
4
0 0
4 0
4 4
0 4

Sample Output:
16.0
16.0
*/
package oop.recursion;
import java.util.stream.*;
import java.util.*;
class return_10{

    public static void main(String[] args){
        // Создаем объект сканера для чтения ввода пользователя
        Scanner sc = new Scanner(System.in);

        // Читаем количество точек
        int n = sc.nextInt();

        // Создаем двумерный массив для хранения координат точек
        double[][] matrix;

        // Заполняем массив координат точек, читая их из ввода пользователя
        matrix = Stream.generate(() -> DoubleStream.generate(sc::nextDouble).limit(2).toArray()).limit(n).toArray(double[][]::new);

        // Вызываем функцию для расчета периметра многоугольника
        // и выводим результат с округлением до двух знаков после запятой
        System.out.println(Math.round(perimeter(matrix)*100)/100.0);

        // Вызываем функцию для расчета площади многоугольника
        // и выводим результат с округлением до двух знаков после запятой
        System.out.println(Math.round(area(matrix)*100)/100.0 );
    }
    static double perimeter(double[][] matrix){
        // Переменная для хранения суммы длин сторон многоугольника
        double per = 0;

        // Перебираем все точки многоугольника, кроме первой
        for(int i = matrix.length - 1; i >= 1; i--){
            // Рассчитываем расстояние между текущей точкой и предыдущей
            per = per + Math.sqrt(Math.pow((matrix[i][0] - matrix[i-1][0]), 2) + Math.pow((matrix[i][1] - matrix[i-1][1]), 2));
            // Если это последняя точка, то также рассчитываем расстояние между ней и первой точкой
            if(i == 1){
                per = per + Math.sqrt(Math.pow((matrix[i-1][0] - matrix[matrix.length-1][0]), 2) + Math.pow((matrix[i-1][1] - matrix[matrix.length-1][1]), 2));
            }
        }

        // Возвращаем результат
        return per;
    }

    // Функция для расчета площади многоугольника
    static double area(double[][] matrix){
        // Переменные для хранения сумм по формуле Гаусса
        double area1 = 0;
        double area2 = 0;

        // Создаем копию массива с координатами точек, добавляя в конец координаты первой точки
        double[][] copy = new double[matrix.length+1][2];
        for(int i = 0; i < copy.length - 1; i++){
            for(int j = 0; j < 2; j++){
                copy[i][j] = matrix[i][j];
            }
        }

        copy[matrix.length][0] = matrix[0][0];
        copy[matrix.length][1] = matrix[0][1];

        // Перебираем все точки многоугольника
        for(int i = 0; i < copy.length - 1; i++){
            // Рассчитываем суммы по формуле Гаусса
            area1 = area1 + copy[i][0] * copy[i+1][1];
            area2 = area2 + copy[i][1] * copy[i+1][0];
        }

        // Возвращаем разность сумм, деленную на два, и модуль этого результата (чтобы обеспечить положительное значение для любого многоугольника)
        return Math.abs(area1-area2)/2;
    }
}