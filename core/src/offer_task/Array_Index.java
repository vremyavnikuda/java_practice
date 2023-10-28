package offer_task;
import java.util.Scanner;

public class Array_Index {

    public static void main(String[] args) {
        // Создаем массив со значениями 1, 2, 3, 4, 5, 6
        int[] array = {1, 2, 3, 4, 5, 6};

        // Создаем объект класса Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести число
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        // Создаем новый массив с размером на 1 больше, чем исходный массив
        int[] newArray = new int[array.length + 1];

        // Копируем значения из исходного массива в новый массив, вставляя число, введенное пользователем, между 3 и 4
        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (i == 3) {
                newArray[i] = number;
                j--;
            } else {
                newArray[i] = array[j];
            }
        }

        // Распечатываем новый массив
        System.out.println("Новый массив: ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
