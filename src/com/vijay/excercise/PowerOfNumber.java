package com.vijay.excercise;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number : ");
		int number = sc.nextInt();
		System.out.println("Enter then power of number : ");
		int power = sc.nextInt();
		int result = 1;
		for(int i = 1;i<=power;i++){
			result = result*number;
		}
		System.out.println("power of "+number+" is ---> "+result);
	}

}
