package com.vijay.excercise;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the any number : ");
		int num = sc.nextInt();
		long factorial=1;
		for(int i=1;i<=num;i++){
			factorial = factorial*i;
		}
		System.out.println("factorial of "+num+" = "+factorial);
	}

}
