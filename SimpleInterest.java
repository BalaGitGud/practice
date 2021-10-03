package com.Te.Assignments;

import java.util.Scanner;

public class SimpleInterest {

	public void Interest() {

		try (Scanner scn = new Scanner(System.in)) {

			System.out.println("Enter the Principal value in Rupees ");
			int p = scn.nextInt();
			System.out.println("Enter the rate of interest in percentage");
			int r = scn.nextInt();
			System.out.println("Enter the number of years");
			int n = scn.nextInt();

			System.out.println("The Interest is " +"Rupees" +" "+ (p * n * r / 100));
		}
	}
}
