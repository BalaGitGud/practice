package com.te.hackerrank;

import java.util.Scanner;

public class Hacker13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String s1=s.trim();
		if (s1.length() > 0) {
			String[] tokens = s.split("[!,?._'@\\s]+");
			System.out.println(tokens.length);
			for(String token : tokens) {
				System.out.println(token);
			}
		} else {
			System.out.println(0);
		}
		scan.close();
	}
}
