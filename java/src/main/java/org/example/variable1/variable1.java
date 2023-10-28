package org.example.variable1;

import java.util.Scanner;

public class variable1 {
	public static void main(String[] args) {
		int a = 5;
		double b = 0.4;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		/*
		scannerInt();
		work_1();
		work_2();
		square_and_perimeter();
		 */
		nextEven();

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
		System.out.println(a*b);
		System.out.println((a+b)*2);
	}

	//Next even
	private static void nextEven() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n+2-(n%2));
	}
}


