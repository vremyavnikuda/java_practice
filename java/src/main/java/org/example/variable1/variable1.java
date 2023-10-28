package org.example.variable1;

import java.util.Scanner;

public class variable1 {
	public static void main(String[] args) {
		int a = 5;
		double b = 0.4;

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		scannerInt();
	}

	private static void scannerInt() {
		Scanner readerNum=new Scanner(System.in);
		int a = readerNum.nextInt();
		int b = readerNum.nextInt();
		System.out.println(a+b);
	}

}


