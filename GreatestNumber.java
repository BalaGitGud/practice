package com.Te.Assignments;

public class GreatestNumber {

	public static void GCD(int x, int y) {
		int i;
		int gcd = 1;

		for (i = 1; i <= x && i <= y; i++) {

			if (x % i == 0 && y % i == 0) {
				gcd = i;
			}

		}
		System.out.println("The greatest common divisor of "+" "+x+" "+"and"+" "+y+" "+"is"+" "+gcd);
	}
}
