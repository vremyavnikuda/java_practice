package org.example.дополнительные_задачи;

import java.util.Scanner;

public class WALLE_1 {
	public static void main(String[] args) {
		task1();
		task2();
		task3();
		task4();
		task5();
		task6();
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
	private static void task3(){
		Scanner readerNumbers = new Scanner(System.in);
		int t = readerNumbers.nextInt();
		int x = readerNumbers.nextInt();
		int y = readerNumbers.nextInt();

		System.out.println(((t*x)/y)+t);
	}

	//task4
	private static void task4(){
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
		double tea_mass=x*10/1000.0;
		double tea_cost=tea_mass*t;

		//вычисление общего кол-во пирожных и их стоимости
		int pastries_count = x*n;
		int pastries_cost=pastries_count*k;

		// вычисление стоимости чаепития
		int total_cost= (int)tea_cost+pastries_cost;

		System.out.println(total_cost);
	}

	//task5
	private static void task5(){
		/*
		* преобразуем кол-во часав и минут в минуты(умножив их на 60)
		* замет прибавим к полученному результату имеющиеся у нас минуты
		* результат будет общим кол-во минут с начало суток
		* */
		Scanner sc=new Scanner(System.in);
		//часы
		int time_h = sc.nextInt();
		//минуты
		int time_m = sc.nextInt();
		// считаем время
		int total_minutes=time_h*60+time_m;
		System.out.println(total_minutes);
	}

	//task6
	private static void task6(){
		Scanner sc=new Scanner(System.in);
		//n - количество страниц в книге
		int n = sc.nextInt();
		//s  - количество страниц, которые прочитывает ВАЛЛ-И каждый день
		int s = sc.nextInt();

		// считаем сколько страниц останется прочитать через 5 дней
		System.out.println(n-(s*5));
	}

}
