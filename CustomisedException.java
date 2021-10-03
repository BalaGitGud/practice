package com.Te.Assignments;

public class CustomisedException {
	
	public void login(String user, String pwd) {
		if (user.equalsIgnoreCase("admin")) {
			if (pwd.equalsIgnoreCase("admin123")) {
				System.out.println("logged in Successfully");
			} else {
				throw new InvalidCredentialsException("Invalid Password");
			}
		} else {
			throw new InvalidCredentialsException("Invalid user ID");
		}
	}
}
