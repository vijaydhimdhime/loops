package com.vijay.excercise;

import java.util.Scanner;

public class DivisibleBy5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		if(num%5 == 0)
		{
			System.out.println("number "+num+" is divisible by 5");
		}
		else
		{
			System.out.println("number "+num+" is NOT divisible by 5");
		}
	}

}
