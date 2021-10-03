package com.Te.Assignments;

public class Box {
	
	double length;

	public Box(double length) {
		this.length = length;

		double Area = 6 * length * length;
		double Perimeter=24*length;
		
		System.out.println("Area of the box is "+" "+Area);
		System.out.println("Perimeter of the box is"+" "+Perimeter);
	}

}
