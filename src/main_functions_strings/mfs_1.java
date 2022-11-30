package main_functions_strings;

class Example{
    public static void main(String[] args){
        //инициализация массива a
        int[] a = new int[]{1, 2, 3};
        //инициализация массива c и присвоение ему массива a
        int[] c = a;
        //меняем элемент под индексом [0] на 5
        c[0] = 5;
        //создаем условие вывода массива
        for (int i = 0; i < a.length; i++)
            //выводим элементы массива
            System.out.print(a[i] + " ");
    }
}
