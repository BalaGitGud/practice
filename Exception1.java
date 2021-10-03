package com.Te.Assignments;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Username");
		String str=s.next();
		
		System.out.println("Enter password");
		String st=s.next();
		
		CustomisedException ref = new CustomisedException();
		
		try {
			ref.login(str,st);
		} catch (InvalidCredentialsException e) {
			System.out.println(e.getMessage());
		}

	}

}
