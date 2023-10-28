package org.example.дополнительные_задачи;

import java.util.Scanner;

public class WALLE_1 {
	public static void main (String []args){
		task1();
		task2();
	}

	// task1
	private static void task1(){
		Scanner readerNumbers=new Scanner(System.in);
		double number=readerNumbers.nextInt();

		System.out.println((number+3)/2);
	}
	// task2
	private static void task2(){
		Scanner readerNumbers=new Scanner(System.in);
		int number= readerNumbers.nextInt();
		int number1= readerNumbers.nextInt();
		int number2= readerNumbers.nextInt();

		int sum = number%10+number1%10+number2%10;

		String password= sum+"vll";
		System.out.println(password);
	}
}
