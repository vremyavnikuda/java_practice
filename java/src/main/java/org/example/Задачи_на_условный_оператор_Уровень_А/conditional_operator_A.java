package org.example.Задачи_на_условный_оператор_Уровень_А;

import java.util.Scanner;

public class conditional_operator_A {
	public static void main(String[] args) {
		/*
		Temperature();
		numberOfDigits();
		*/
		numberOfDigits_1();
	}

	private static void Temperature() {
		Scanner sc = new Scanner(System.in);

		double Temperature = sc.nextDouble();

		if (Temperature < 22.4) {
			System.out.println("Холодно(");
		} else if (Temperature > 22.4) {
			System.out.println("Тепло!");
		} else {
			System.out.println("Прохладно...");
		}
	}

	//Number of digits 1
	private static void numberOfDigits() {
		Scanner sc = new Scanner(System.in);

		int numberOf = sc.nextInt();

		if (numberOf >= 10 && numberOf <= 99) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	//Number of digits 2
	private static void numberOfDigits_1() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int digitCount = (int) Math.log10(number) + 1;

		System.out.println(digitCount);
	}
}
