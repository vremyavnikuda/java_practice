package org.example.дополнительные_задачи;

import java.util.Scanner;

public class WALLE_1 {
	public static void main(String[] args) {
		/*
		task1();
		task2();
		task3();
		task4();
		task5();
		task6();
		task7();
		task8();
		task9();
		task10();
		task11();
		task12();
		task13();
		task14();
		*/
		task15();
	}

	// task1
	private static void task1() {
		Scanner readerNumbers = new Scanner(System.in);
		double number = readerNumbers.nextInt();

		System.out.println((number + 3) / 2);
	}

	// task2
	private static void task2() {
		Scanner readerNumbers = new Scanner(System.in);
		int number = readerNumbers.nextInt();
		int number1 = readerNumbers.nextInt();
		int number2 = readerNumbers.nextInt();

		int sum = number % 10 + number1 % 10 + number2 % 10;

		String password = sum + "vll";
		System.out.println(password);
	}

	//task3
	private static void task3() {
		Scanner readerNumbers = new Scanner(System.in);
		int t = readerNumbers.nextInt();
		int x = readerNumbers.nextInt();
		int y = readerNumbers.nextInt();

		System.out.println(((t * x) / y) + t);
	}

	//task4
	private static void task4() {
		Scanner readerNumbers = new Scanner(System.in);

		//x - количество приглашенных друзей
		int x = readerNumbers.nextInt();

		//t - стоимость килограмма чая
		int t = readerNumbers.nextInt();

		//k - стоимость одного пирожного
		int k = readerNumbers.nextInt();

		//n - количество пирожных
		int n = readerNumbers.nextInt();

		// вычисление общей массы чая и его стоимости
		double tea_mass = x * 10 / 1000.0;
		double tea_cost = tea_mass * t;

		//вычисление общего кол-во пирожных и их стоимости
		int pastries_count = x * n;
		int pastries_cost = pastries_count * k;

		// вычисление стоимости чаепития
		int total_cost = (int) tea_cost + pastries_cost;

		System.out.println(total_cost);
	}

	//task5
	private static void task5() {
		/*
		 * преобразуем кол-во часав и минут в минуты(умножив их на 60)
		 * замет прибавим к полученному результату имеющиеся у нас минуты
		 * результат будет общим кол-во минут с начало суток
		 * */
		Scanner sc = new Scanner(System.in);
		//часы
		int time_h = sc.nextInt();
		//минуты
		int time_m = sc.nextInt();
		// считаем время
		int total_minutes = time_h * 60 + time_m;
		System.out.println(total_minutes);
	}

	//task6
	private static void task6() {
		Scanner sc = new Scanner(System.in);
		//n - количество страниц в книге
		int n = sc.nextInt();
		//s  - количество страниц, которые прочитывает ВАЛЛ-И каждый день
		int s = sc.nextInt();

		// считаем сколько страниц останется прочитать через 5 дней
		System.out.println(n - (s * 5));
	}

	//task7
	private static void task7() {
		Scanner sc = new Scanner(System.in);

		//n - количество страниц в книге
		int n = sc.nextInt();
		//s  - количество страниц, которые прочитывает ВАЛЛ-И каждый день
		int s = sc.nextInt();
		//d - количество дней
		int d = sc.nextInt();

		System.out.println(n - (d * s));
	}

	//task8
	private static void task8() {
		Scanner sc = new Scanner(System.in);

		// n - кол-во детей
		int n = sc.nextInt();
		// k - кол-во яблок
		int k = sc.nextInt();

		int apples_per_child = k / n;
		int apples_per_Eva = k % n;

		System.out.println(apples_per_child + " " + apples_per_Eva);
	}

	//task9
	private static void task9() {
		Scanner sc = new Scanner(System.in);

		//t- время в секундах, за которое лифт поднимается на один этаж.
		int t = sc.nextInt();
		// n - номер этажа, на который надо подняться
		int n = sc.nextInt();

		System.out.println((n*t)-t);
	}

	//task10
	private static void task10(){
		Scanner sc =new Scanner(System.in);

		// x - число, которое загадывает валли
		int x = sc.nextInt();
		// n - на сколько увеличивается последняя цифра
		int n = sc.nextInt();

		int x_lastNumber=(x%10)+n;

		System.out.println(x_lastNumber);
	}

	//task11
	private static void task11(){
		Scanner sc =new Scanner(System.in);

		//s - расстояние
		int s = sc.nextInt();
		//v - скорость
		int v = sc.nextInt();

		double time= (double)s/v;
		System.out.println(time);
	}

	//task12
	private static void task12(){
		Scanner sc =new Scanner(System.in);

		//n - количество слов
		int n = sc.nextInt();
		//d - количество дней
		int d = sc.nextInt();

		System.out.println(n*d);
	}

	//task13
	private static void task13(){
		Scanner sc =new Scanner(System.in);

		//h - количество лошадей
		int h = sc.nextInt();
		//g - количество гусей
		int g = sc.nextInt();

		System.out.println((h*4)+(g*2));
	}

	//task14
	private static void task14(){
		Scanner sc =new Scanner(System.in);

		//x - скорость ВАЛЛ-И
		int x = sc.nextInt();
		//y - скорость ЕВЫ
		int y = sc.nextInt();
		//t - время ВАЛЛ-И
		int t = sc.nextInt();
		//m - время ЕВЫ
		int m = sc.nextInt();

		//сколько проехал валли
		int distance_valli= x*t;
		//сколько проехала ева
		int distance_eva=y*m;
		System.out.println(distance_valli+distance_eva);
	}

	//task15
	private static void task15(){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		System.out.println((x+1)+"-"+(x+2)+"-"+(x+3));
	}
}
