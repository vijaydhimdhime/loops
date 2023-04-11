package com.vijay.excercise;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of triangle");
		double base = sc.nextDouble();
		System.out.println("Enter the height of triangle ");
		Double height = sc.nextDouble();
		 area = (1/2) * base * height;
		System.out.println("Area of Triangle = "+area);
	}

}
