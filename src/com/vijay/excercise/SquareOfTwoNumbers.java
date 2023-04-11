package com.vijay.excercise;

import java.util.Scanner;

public class SquareOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		int square = num*num;
		System.out.println("square of "+num+" is ---> "+square);
	}

}
