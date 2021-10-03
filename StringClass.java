package com.Te.Assignments;

import java.util.Scanner;

public class StringClass {
	Scanner s = new Scanner(System.in);

	public void getString() {

		System.out.println(
				"Press 1 to Reverse the string,2 to check Equality ignoring case,3 to check Equality with case, 4 to change case to upper and 5 for lower");
		int opr = s.nextInt();

		switch (opr) {
		case 1:
			System.out.println("Enter the String ");
			String str = s.next();
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.println("The reversed string is" + " " + str.charAt(i));
			}
			break;

		case 2:
			System.out.println("Enter the String ");
			String st = s.next();
			System.out.println("Enter the string to check equality ");
			String s1 = s.next();
			boolean b = st.equalsIgnoreCase(s1);

			if (b == true) {
				System.out.println("It has equal String");
			} else {
				System.out.println("It doesn't have equal string");
			}
			break;
		case 3:
			System.out.println("Enter the String ");
			String s2 = s.next();
			System.out.println("Enter the string to check equality ");
			String s3 = s.next();
			boolean c = s2.contains(s3);

			if (c == true) {
				System.out.println("It has equal String");
			} else {
				System.out.println("It doesn't have equal string");
			}
			break;

		case 4:
			System.out.println("Enter the String to convert it to Upper case ");
			String s4 = s.next();
			System.out.println("The resultant case is" + " " + s4.toUpperCase());
			break;

		case 5:
			System.out.println("Enter the String to convert it to lower case ");
			String s5 = s.next();
			System.out.println("The resultant case is" + " " + s5.toLowerCase());
			break;
		}

	}
}
