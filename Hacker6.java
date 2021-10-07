package com.te.hackerrank;

import java.util.Scanner;

public class Hacker6 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String s = "" + n;
		if (n == Integer.parseInt(s)) {
			System.out.println("Good job");
		} else {
			System.out.println("Wrong answer.");
		}
	}
}
