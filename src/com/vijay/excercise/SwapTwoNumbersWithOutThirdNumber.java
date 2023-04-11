package com.vijay.excercise;

import java.util.Scanner;

public class SwapTwoNumbersWithOutThirdNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swap a = "+a+" "+" b = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		 System.out.println("After swap a = "+a+" "+" b = "+b);
	}

}

