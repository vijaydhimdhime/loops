package com.vijay.excercise;

import java.util.Scanner;

public class SumOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numbers :");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i=i+2)
		{
			sum=sum+i;
			//System.out.println("odd numbers : "+i);
		}
		System.out.println(sum);
	}

}
