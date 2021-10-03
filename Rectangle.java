package com.Te.Assignments;

public class Rectangle extends Box {

	double length;
	double breadth;

	public Rectangle(double length, double breadth) {
		
		super(25);
		this.length = length;
		this.breadth = breadth;
		
		double area= length*breadth;
		double perimeter=2*length*breadth;
		
		System.out.println("Area of the Rectangle is "+" "+area);
		System.out.println("Perimeter of the Rectangle is "+" "+perimeter);
	}

}
