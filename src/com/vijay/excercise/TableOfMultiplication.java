package com.vijay.excercise;

import java.util.Scanner;

public class TableOfMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number of multiplication table : ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+" = "+num*i);
			
		}
	//table of 2's
	}

}
