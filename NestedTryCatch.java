package com.Te.Assignments;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NestedTryCatch {

	public void serialization(String fileName) {

		Example ex = new Example();

		FileOutputStream fos;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(fileName);
			try {
				oos = new ObjectOutputStream(fos);
				oos.writeObject(ex);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Writing Object completed");

	}

}
