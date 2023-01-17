package oop_Инициализаторы_static_final;

public class SmallSquares {

    private static final int LIMIT = 10;
    private static final int[] square = new int[LIMIT];


    //используем статический блок инициализации массива квадратов
    static {
        for (int i = 0;i<LIMIT;i++){
            square[i]=i*i;
        }
    }


    //статический метод getSquare
    //возвращаем значение square
    public static int getSquare(int i) {
        // Нет обработки ошибки, предположим, 0<=i<limit
        return square[i];
    }

    //выводим в консоль полученный результат
    public static void main(String[] args) {
        System.out.println("3 squared is " +
                getSquare(3));
    }
}