package com.Te.Assignments;

import java.util.Scanner;

public class AccountWithdrawal extends Account {

	public void withdrawalAtm() {

		int i = 3;
		int pin = 1850;
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter bank account type");
		String s = scn.nextLine();

		if (s.equalsIgnoreCase(accountType)) {

			System.out.println("Enter the PIN number, do not disclose this to anyone!");

			while (i > 0) {

				if (i < 3) {
					System.out.println("Enter the PIN number ");
				}
				int num = scn.nextInt();

				if (num == pin) {
					System.out.println("Please enter the withdrawal amount");
					double amt = scn.nextDouble();

					if (amt <= balance) {
						System.out.println("Please wait... Transaction in progress...");
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Transaction completed! Thank you! For complaints call 1800 123 456 ");
						balance -= amt;
						System.out.println("Balance in the account" + " " + balance);
						break;
					} else {
						System.out.println("Transaction failed! Insufficient balance! ");
						break;
					}
				}

				if (i <= 3) {
					if (i == 3 && pin != num) {
						System.out.println("Invalid PIN,Retry.Only 2 attempts left ");
					}
					if (i == 2 && pin != num) {
						System.out.println("Invalid PIN,Retry.Only 1 attempt left ");
					}
					if (i == 1 && pin != num) {
						System.out.println("Your account is locked. Contact your Branch Manager for details ");
					}
				}
				i--;
			}
		}

	}
}
