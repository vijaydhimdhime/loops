package com.vijay.excercise;

public class AreaOfRectangle {
	float area;
	void area(int l, int b){
		area = l * b;
		System.out.println("area of rectangle = "+area);
	}
	public static void main(String[] args) {
		AreaOfRectangle a = new AreaOfRectangle();
		a.area(10, 20);
		
	}

}
