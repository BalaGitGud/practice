package com.Te.Assignments;

import java.util.Scanner;

public class AccountDeposit extends AccountWithdrawal {
	public void deposit() {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your account number ");
		int acc = scn.nextInt();
		System.out.println("Enter your Name same as your passbook ");
		String str = scn.next();

		if (str.equalsIgnoreCase(name) && acc == accountNumber) {
			System.out.println("Welcome! select 1 for deposit,2 for withdrawal,3 for exit ");

			int opr = scn.nextInt();

			switch (opr) {
			case 1:
				System.out.println("Enter amount to add to your account");
				int amount = scn.nextInt();

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
					break;
				} else {
					System.out.println("Amount should be greater than 100 ");
					break;
				}

			case 2:
				AccountWithdrawal ref = new AccountWithdrawal();
				ref.withdrawalAtm();
				break;

			case 3:
				System.out.println("Thank you for using our services! ");
				break;
			}
		} else {
			System.out.println("Wrong Credentials check your Account number or Name and try again!");
		}

	}
}
