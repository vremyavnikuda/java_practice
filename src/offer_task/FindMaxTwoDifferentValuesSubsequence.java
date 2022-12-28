package offer_task;
import java.util.ArrayList;
import java.util.List;

public class FindMaxTwoDifferentValuesSubsequence {

    public static int findMaxLength ( int[] arr){
        // Счетчик для отслеживания максимальной длины подпоследовательности
        int maxLength = 0;
        // Счетчик для отслеживания текущей длины подпоследовательности
        int currentLength = 1;
        // Список для хранения уникальных значений текущей подпоследовательности
        List<Integer> uniqueValues = new ArrayList<>();
        uniqueValues.add(arr[0]);
        // Перебор элементов массива
        for (int i = 1; i < arr.length; i++) {
            // Если текущее значение не совпадает с предыдущим, то увеличиваем счетчик текущей длины
            if (arr[i] != arr[i - 1]) {
                currentLength++;
            } else {
                // Иначе сбрасываем счетчик текущей длины и очищаем список уникальных значений
                currentLength = 1;
                uniqueValues.clear();
            }
            // Добавляем текущее значение в список уникальных значений
            uniqueValues.add(arr[i]);
            // Если список уникальных значений содержит только 2 различных числа и текущая длина больше текущей максимальной, то обновляем максимальную длину
            if (uniqueValues.size() == 2 && currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }





        public static void main(String[]args){
        int[] arr = {3, 2, 3, 1, 3, 2, 3, 3, 5, 3, 5, 4, 7, 4, 4, 8};
        int maxLength = findMaxLength(arr);
        System.out.println(maxLength);
    }
}
