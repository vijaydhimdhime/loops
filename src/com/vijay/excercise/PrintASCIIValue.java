package com.vijay.excercise;

import java.util.Scanner;

public class PrintASCIIValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any charecter : ");
		char ch = sc.next().charAt(0);
		int x = ch;
		System.out.println("ASCII value of charecter is "+x);
	}

}
