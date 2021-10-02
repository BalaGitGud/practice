package com.Te.Programs.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial {

	public void serialization(String fileName)  {

		Example ex = new Example();

		FileOutputStream fos;
		 
			try {
				fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(ex);
				System.out.println("Writing Object completed");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}


	public void deSerialization(String fileName)  {
		
		FileInputStream fis;
        try {
			fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Example obj=(Example) ois.readObject();
			System.out.println("Reading Object completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			

	}

}
