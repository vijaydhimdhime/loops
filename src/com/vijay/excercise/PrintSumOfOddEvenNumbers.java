package com.vijay.excercise;

import java.util.Scanner;

public class PrintSumOfOddEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		int sum=0;
		if(num%2 == 0)
		{
			System.out.println("number "+num+" is even");
			for(int i = 0; i<=num; i=i+2)
			{
				sum = sum+i;				
			}
			System.out.println("sum of even number of "+num+" is"+"\n"+"sum = "+sum);
		}
		else
		{
			System.out.println("number "+num+" is odd");
			for(int i = 1; i<=num; i=i+2)
			{
				sum = sum+i;					
			}
			System.out.println("sum of Odd number of "+num+" is"+"\n"+"sum = "+sum);
		}
	}

}
