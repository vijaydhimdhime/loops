package com.vijay.excercise;

import java.util.Scanner;

public class AddtionOfNaturalNum {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter any natural numbers :");
		int num = sc.nextInt();
		//int num=5;
		int sum = 0;
		for(int i=0;i<=num;i++){
		
			sum = sum+i;
			
		}
		System.out.println("sum of natural numbers"+" \n"+ "sum = "+sum);
	}

}
