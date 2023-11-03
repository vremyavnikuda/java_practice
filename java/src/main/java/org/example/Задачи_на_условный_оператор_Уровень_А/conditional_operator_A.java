package org.example.Задачи_на_условный_оператор_Уровень_А;

import java.util.Scanner;

public class conditional_operator_A {
	public static void main(String[] args) {

		Temperature();
		numberOfDigits();
		numberOfDigits_1();
		Equation1();
		Equation2();
		Equation3();
		Point1();
		Point2();
		Point3();
		Point4();
		Point5();
		Point6();
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

	//Equation 1
	private static void Equation1() {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();

		if (i == 0) {
			if (j == 0) {
				System.out.println("inf");
			} else {
				System.out.println(0);
			}
		} else {
			System.out.println(1);
		}
	}

	//Equation 2
	private static void Equation2() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int discriminnat = b * b - 4 * a * c;

		if (discriminnat > 0) {
			System.out.println(2);
		} else if (discriminnat == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	//Equation 3
	private static void Equation3() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("inf");
				} else {
					System.out.println(0);
				}
			} else {
				System.out.println(1);
			}
		} else {

			int dicriminant = b * b - 4 * a * c;

			if (dicriminant > 0) {
				System.out.println(2);
			} else if (dicriminant == 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}

	//Point 1
	private static void Point1() {
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		sc.close();

		if (y > 2 * x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	//Point 2
	private static void Point2() {
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();

		if (y < (3 * x) & y > (2 * x)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	//point 3
	private static void Point3() {
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		sc.close();

		if (((x * x - 2 * x - 3) < y) & ((x / 2) > y)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	//point 4
	private static void Point4() {
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		sc.close();

		if ((y * y) + (x * x) < 5 && ((x * x) - 3) > y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	//point 5
	private static void Point5() {
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();

		if ((y * y + x * x < 5) && (x * x - 3 > y) && (0.5 * x - 1) < y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	// point 6
	private static void Point6() {
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		sc.close();

		if ((y > 0.5 * x - 1) && (y < x * x - 3) && (y * y < 5 - x * x) || (-2 > y && y > -3 && -1 < x && x < 1)) {
			System.out.print("Yes");
		} else {
			System.out.print("No");

		}
	}
}




