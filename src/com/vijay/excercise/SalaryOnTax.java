package com.vijay.excercise;

import java.util.Scanner;

public class SalaryOnTax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of employee : ");
		double salary = sc.nextInt();
		double tax;
		if(salary<=100000)
		{
			System.out.println("No Tax on Salary!!!");
		}
		else if(salary>100000 && salary<=1000000)
		{
			System.out.println("10% tax on salary");
			tax = salary * 0.1;
			salary = salary - tax;
			System.out.println("tax = "+tax);
			System.out.println("Net salary = "+salary);
			
		}
		if(salary>1000000)
		{
			System.out.println("20% tax on salary");
			tax = salary * 0.3;
			salary = salary - tax;
			System.out.println("tax = "+tax);
			System.out.println("Net salary = "+salary);
		}
	}

}
