package com.vijay.excercise;

import java.util.Scanner;

public class AverageMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of five subjects : ");
		int phy = sc.nextInt();
		int che = sc.nextInt();
		int bio = sc.nextInt();
		int maths = sc.nextInt();
		int marathi = sc.nextInt();
		float total = phy+che+bio+maths+marathi;
		float avg = total/5;
		System.out.println("Average of marks : "+avg);
	}

}
