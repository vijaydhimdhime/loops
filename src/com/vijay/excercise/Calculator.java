package com.vijay.excercise;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any two numbers : ");
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Select operation : ");
		int choice = sc.nextInt();
		int result;
	
		if(choice == 1)
		{
			result = a+b;
			System.out.println("Addition = "+result);
		}
		else if(choice == 2)
		{
			result = a-b;
			System.out.println("Substraction = "+result);
			
		}
		else if(choice == 3)
		{
			result = a*b;
			System.out.println("Multiplication = "+result);
			
		}
		else if(choice == 4)
		{
			result = a/b;
			System.out.println("Division = "+result);
			
		}
		
		else
		{
			System.out.println("Invalid choice!!!!");
		}
	}
		
}
	
