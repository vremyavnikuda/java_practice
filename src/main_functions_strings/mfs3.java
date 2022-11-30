package main_functions_strings;

import java.util.Scanner;

public class mfs3 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        //alerg==есть аллергия no_alerg==нет аллергии
        String alerg=sc.nextLine(),no_alerg= sc.nextLine();
        //получаем рецепт в котором нужно произвести замену
        String recept= sc.nextLine();
        //сохраняем правильный рецепт с заменой продуктов на которые у нас аллергия
        String recept_no_alerg=recept.replace(alerg,no_alerg);
        //показываем правильный рецепт
        System.out.println(recept_no_alerg);
    }
}
