package com.vijay.excercise;

import java.util.Scanner;

public class ConvertCharacterUppercaseToLowercase {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any character : ");
		char ch = sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println(Character.toLowerCase(ch));
		}
		else
		{
			System.out.println(Character.toUpperCase(ch));
		}
	}
	
}
