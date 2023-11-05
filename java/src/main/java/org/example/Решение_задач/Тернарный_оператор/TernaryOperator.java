package org.example.Решение_задач.Тернарный_оператор;

import java.util.Scanner;

public class TernaryOperator {
	public static void main (String []args){
		math();
	}

	//Вам есть 21?
	private static void areYou21(){
		Scanner sc=new Scanner(System.in);

		int age=sc.nextInt();

		if (age>=21){
			System.out.println("Да");
		}else {
			System.out.println("Нет");
		}
	}
	private static void math(){
		int a = 255;
		int b = a++;
		a /= 8;
		b *= 2;
		int c = b / 10;
		if (a + b + c > 600){
			System.out.println(--b);
		}else{
			System.out.println(c++);
		}
	}
}
