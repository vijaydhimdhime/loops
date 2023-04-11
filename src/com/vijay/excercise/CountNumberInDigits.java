package com.vijay.excercise;

import java.util.Scanner;

public class CountNumberInDigits {             //i/p 123456       o/p = 6

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any numbers : ");
		int num = sc.nextInt();
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
			
		}
		System.out.println("digit count : "+count);
	}
}
