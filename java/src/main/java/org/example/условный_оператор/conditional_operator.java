package org.example.условный_оператор;

import java.util.Scanner;

public class conditional_operator {
	public static void main(String[] args) {
		/*
		track();
		whyMore();
		task1();
		task2();
		task3();
		*/
		task4();
	}

	//Track
	private static void track() {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(a * b);
	}

	// Why more
	private static void whyMore() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	//task1
	private static void task1() {
		int first = 15;
		int second = --first;
		second *= 2;
		int third = second - 13;
		if (first == third) {
			System.out.println(--second);
		} else {
			System.out.println(third - first + second);
		}
	}

	//task2
	private static void task2() {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();

		if (line.equals(line1) && line2.equals(line)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	//task3
	private static void task3() {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		if (b == 0) {
			System.out.println("Error");
		} else {
			System.out.println(a / b);
		}
	}

	//task4
	private static void task4() {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		if (i - 10 > i / 2) {
			System.out.println(i - 10);
		} else {
			System.out.println(i / 2);
		}
	}

	//Strange clock
	private static void strangeClock() {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();


		int secondsPassed=h *3600+m*60;
		if (secondsPassed<=x){
			System.out.println("Успел");
		}else {
			System.out.println("Опоздал");
		}
	}
}
