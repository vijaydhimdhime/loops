package com.vijay.excercise;

import java.util.Scanner;

public class GeatestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b){
			System.out.println("greatest :"+a);
		}
		else
		{
			System.out.println("greatest : "+b);
		}
	}

}
