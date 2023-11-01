package org.example.Задачи_на_условный_оператор_Уровень_А;

import java.util.Scanner;

public class conditional_operator_A {
	public static void main (String []args){
		Temperature();
	}

	private static void Temperature(){
		Scanner sc =new Scanner(System.in);

		double Temperature=sc.nextDouble();

		if (Temperature<22.4){
			System.out.println("Холодно(");
		} else if (Temperature>22.4) {
			System.out.println("Тепло!");
		}else{
			System.out.println("Прохладно...");
		}
	}
}
