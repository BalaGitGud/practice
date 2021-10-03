package com.Te.Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class MultipleTryCatch {
	
	public void deSerialization(String fileName) {

		FileInputStream fis;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(fileName);
			try {
				ois = new ObjectInputStream(fis);
				 ois.readObject();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Reading Object completed");

	}

}
