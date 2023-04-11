package com.vijay.excercise;

import java.util.Scanner;

public class PrintEvenNumbre {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the any numbers :");
		int num = sc.nextInt();
		for(int i =0;i<=num;i=i+2){
			System.out.println("Even number : "+i);
		}
		
	}

}
