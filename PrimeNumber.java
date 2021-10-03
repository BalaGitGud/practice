package com.Te.Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {
	
	public void prime() {
		
		System.out.println("Enter the number to find out whether it is a prime or not ");
		
		try(Scanner s = new Scanner(System.in);) {
			int n = s.nextInt();

			if (n == 0 || n == 1) {
				System.out.println("The given number is Not a prime number");
			}
			if (n == 2) {
				System.out.println("The given number is Prime number");
			}

			boolean flag = false;

			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					flag = true;
					break;
				}
			}
			if (n > 2) {
				String str = (flag == true) ? "The Number is not a prime number " : "The number is a prime number";
				System.out.println(str);
			}

		} catch (InputMismatchException e) {
			System.out.println("only integer numbers are allowed");
		}
	}
}
