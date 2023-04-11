package com.vijay.excercise;

//import java.util.Scanner;

public class AreaOfCircle {
	// public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	// System.out.println("Enter radius of circle : ");
	// int radius = sc.nextInt();
	// double area;
	// area = 3.14 * radius * radius;
	// System.out.println("area of circle is : "+area);
	// }

	double area, r, PI=3.14;

	void area(double r) {
		area = PI * r * r;
		System.out.println("area of circle is = " + area);
	}

	public static void main(String[] args) {
		AreaOfCircle a = new AreaOfCircle();
		a.area(10);

	}

}
