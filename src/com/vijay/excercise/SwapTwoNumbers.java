package com.vijay.excercise;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swap a = "+a+" "+" b = "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap a = "+a+" "+" b = "+b);
	}

}
