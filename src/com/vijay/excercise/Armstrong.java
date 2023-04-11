
				/*ARMSTRONG PROGRAM*/
// i/p-----------153    1^3+5^3+3^3=153	((1*1*1)+(5*5*5)+(3*3*3) = 153)
// o/p -----------153
package com.vijay.excercise;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int n, arm=0, ramainder, c;
		System.out.println("Enter any number : ");
		Scanner sc  = new Scanner(System.in);
		n= sc.nextInt();
		c =n;
		while(n>0)
		{
			ramainder = n%10;
			arm = (ramainder*ramainder*ramainder)+arm;
			n = n/10;
		}
		System.out.println(arm);
		if(c == arm)
			System.out.println("Number is armstrong");
		else
			System.out.println("number ia not armstrong");
	}

}
