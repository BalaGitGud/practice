package com.Te.Assignments;

public class CommandLineSum {

	public static void main(String[] args) {
		
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		
		int z=x+y;
		System.out.println("The sum of the two numbers are"+" "+z);
		
		System.out.println("The average of the numbers are"+" "+(x+y)/2);

	}

}
