package com.Te.Assignments;

import java.util.Scanner;

public class AbstractImpl extends Abstraction {
	
	@Override
	void login() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter username");
		String user = s.next();
		System.out.println("Enter password");
		String pwd = s.next();

		if (user.equalsIgnoreCase("admin")) {
			if (pwd.equalsIgnoreCase("admin123")) {
				System.out.println("logged in Successfully");
			} else {
				System.out.println("Invalid username ");
			}
		} else {
			System.out.println("Invalid password");
		}
		
	}

	  @Override
	   void deposit() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your account number ");
		int acc = s.nextInt();
		System.out.println("Enter your Name same as your passbook ");
		String str = s.next();
		int balance = 1000;

		if (str.equalsIgnoreCase("Balakumara") && acc == 645854654) {
			System.out.println("Enter amount to add to your account");
			int amount = s.nextInt();

			if (amount >= 100) {
				System.out.println("wait for a minute...");
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Amount sucessfully added ");
				balance += amount;
				System.out.println("Account balance is " + " " + balance);
			} else {
				System.out.println("Amount should be greater than 100 ");
			}

		} else {
			System.out.println("Wrong Credentials check your Account number or Name and try again!");
		}
	}
}

