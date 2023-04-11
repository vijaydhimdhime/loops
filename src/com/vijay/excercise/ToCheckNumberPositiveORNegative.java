package com.vijay.excercise;

import java.util.Scanner;

public class ToCheckNumberPositiveORNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.println("Number "+num+" is +ve");
		}
		else if(num<0)
		{
			System.out.println("Number "+num+" is -ve");
		}
		else
		{
			System.out.println("Niether Number "+num+" is +ve NOR -ve");
			
		}
	}

}
