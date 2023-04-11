					/*find factor of any number*/
/*       HOW MANY NUMBERS ARE DIVIDED TO THAT NUMBER      */

package com.vijay.excercise;

import java.util.Scanner;

public class FactorOfNumbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any number : ");
		int num = sc.nextInt();
		for(int i = 1;i<=num;i++)
		{	
			if(num%i == 0)
			{
				System.out.println(i);
			}
		}
	}

}
