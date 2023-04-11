package com.vijay.excercise;

import java.util.Scanner;

public class VotingCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of voter : ");
		int age = sc.nextInt();
		if(age>=18)
			System.out.println("Valid for voting!!!!");
		else
			System.out.println("Invalid for Voting!!!!");
	}

}
