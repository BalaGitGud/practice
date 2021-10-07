package com.te.hackerrank;

public class Hacker9 {
	public static void main(String[] args) {

		String str = "Madam";
		str = str.toUpperCase();
		boolean flag = true;

		for (int i = 0; i <= str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(" Palindrome");
		} else {
			System.out.println("Not Palindrome ");
		}
	}
}
