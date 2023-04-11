package com.vijay.excercise;

public class AreaOfSquare {
	double side, area;
		 void area(double side)
		 {
			 area = side*side;
			 System.out.println("Area of Square = "+area);
		 }
		 public static void main(String[] args) {
			AreaOfSquare as = new AreaOfSquare();
			as.area(15);
		}

}
