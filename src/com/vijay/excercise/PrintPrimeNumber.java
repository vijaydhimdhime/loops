package com.vijay.excercise;

import java.util.Scanner;

public class PrintPrimeNumber {
	public static void main(String[] args) {
		int n1,n2, i, j;
		System.out.println("Enter any two numbers : ");
		Scanner sc= new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		for(i=n1;i<=n2;i++)
		{
			for(j=2;j<=i;j++)
			
			{
				if(i%j == 0)
					break;		
			}
			if((i==j))
				System.out.println(i);
			
		}
	}

}
