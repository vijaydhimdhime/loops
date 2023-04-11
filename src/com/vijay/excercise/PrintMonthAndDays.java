package com.vijay.excercise;

import java.util.Scanner;

public class PrintMonthAndDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("JANWARY"+"---->"+" 31 Days");
			break;
		case 2:
			System.out.println("February"+"---->"+" 28 Days");
			break;
		case 3:
			System.out.println("March"+"---->"+" 31 Days");
			break;
		case 4:
			System.out.println("April"+"---->"+" 30 Days");
			break;
		case 5:
			System.out.println("May"+"---->"+" 31 Days");
			break;
		case 6:
			System.out.println("june"+"---->"+" 30 Days");
			break;
		case 7:
			System.out.println("Juley"+"---->"+" 31 Days");
			break;
		case 8:
			System.out.println("August"+"---->"+" 31 Days");
			break;
		case 9:
			System.out.println("September"+"---->"+" 30 Days");
			break;
		case 10:
			System.out.println("Octomber"+"---->"+" 31 Days");
			break;
		case 11:
			System.out.println("November"+"---->"+" 30 Days");
			break;
		case 12:
			System.out.println("December"+"---->"+" 31 Days");
			break;

		default:
			System.out.println("INVALID CHOICE!!!!! ");
			break;
		}
	}

}
