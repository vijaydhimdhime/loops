package com.vijay.excercise;

import java.util.Scanner;

public class CharPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any character");
		char ch = sc.next().charAt(1);
		System.out.println(ch);
	}

}
