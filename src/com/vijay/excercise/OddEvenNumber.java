package com.vijay.excercise;

import java.util.Scanner;

public class OddEvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int number = sc.nextInt();
		if(number%2 == 0){
			System.out.println("number "+number+" is even number");
		}
		else
		{
			System.out.println("number "+number+" is Odd number");
		}
	}

}
