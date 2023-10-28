package org.example.variable1;

import java.util.Scanner;

public class variable1 {
	public static void main(String[] args) {
		scannerInt();
		work_1();
		work_2();
		square_and_perimeter();
		nextEven();
		int a = 5;
		double b = 0.4;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		costOfPurchase();
		lastDigit();
		sumDigits();
		MKAD();
		Snail();
	}

	private static void scannerInt() {
		Scanner readerNum = new Scanner(System.in);
		int a = readerNum.nextInt();
		int b = readerNum.nextInt();
		System.out.println(a + b);
	}

	private static void work_1() {
		Scanner readerNum = new Scanner(System.in);
		int a = readerNum.nextInt();
		int b = readerNum.nextInt();
		int c = readerNum.nextInt();
		System.out.println(a * b * c);
	}

	private static void work_2() {
		Scanner readerNumber = new Scanner(System.in);
		int a = readerNumber.nextInt();

		System.out.println("The next number for the number " + a + " is " + (a + 1) + ".");
		System.out.println("The previous number for the number " + a + " is " + (a - 1) + ".");
	}

	// Square and perimeter
	private static void square_and_perimeter() {
		Scanner readerNumbers = new Scanner(System.in);
		int a = readerNumbers.nextInt();
		int b = readerNumbers.nextInt();
		System.out.println(a * b);
		System.out.println((a + b) * 2);
	}

	//Next even
	private static void nextEven() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n + 2 - (n % 2));
	}

	//Cost of purchase
	private static void costOfPurchase() {
		Scanner priceReader = new Scanner(System.in);
		int a = priceReader.nextInt();
		int b = priceReader.nextInt();
		int n = priceReader.nextInt();

		int cost_a = a * 100 + b;
		int totalCost_a = cost_a * n;
		int a_all = totalCost_a / 100;
		int b_all = totalCost_a % 100;
		System.out.println(a_all + " " + b_all);
	}

	//The last digit
	private static void lastDigit() {
		Scanner lastDigitReader = new Scanner(System.in);
		int n = lastDigitReader.nextInt();

		int lastDigit = n % 10;
		System.out.println(lastDigit);
	}

	// Sum of digits
	private static void sumDigits() {
		Scanner sumDigitReader = new Scanner(System.in);
		int sumNumbers = sumDigitReader.nextInt();

		int one = sumNumbers / 100;
		int two = (sumNumbers % 100) / 10;
		int three = sumNumbers % 10;

		System.out.println(one + two + three);
	}

	//МКАД
	private static void MKAD() {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int t = sc.nextInt();
		int s = v * t;
		System.out.println((109 + s % 109) % 109);
	}

	// Улитка
	private static void Snail() {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(((h - b) + (a - b) - 1) / (a - b));
	}
}


