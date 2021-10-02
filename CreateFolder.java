package com.Te.Programs.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolder {
	
	public void createFolder(String fileName) {
		File ref = new File(fileName);
		boolean b = ref.exists();

		if (b == true) {
			System.out.println("Folder exists");
		} else {
			ref.mkdir();
			System.out.println("Folder created");
		}

	}

	public void createFile(String fileName) {
		File ref = new File(fileName);
		boolean b = ref.exists();
		try {
			if (b == false) {
				ref.createNewFile();
			} else {
				System.out.println("FileExists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteFile(String fileName) {
		File ref = new File(fileName);
		boolean b = ref.exists();
		if (b == true) {
			ref.delete();
			System.out.println("File got deleted");
		} else {
			System.out.println("File doesn't exists");
		}
	}

	public void fileWriter(String fileName) {
		FileWriter ref = null;
		try {
			ref = new FileWriter(fileName,true);
			ref.write("Java is high level Programming language ");
			ref.write("\n");
			ref.write("Java is Platform Independent ");
			ref.flush();
			System.out.println("File writer completed");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ref.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void fileReader(String fileName) {
		FileReader ref = null;
		try {
			ref = new FileReader(fileName);
			int val = ref.read();
			while (val != -1) {
				System.out.print((char) val);
				val = ref.read();
			}

		} catch (Exception e) {
			System.out.println("Read operation failed");
		} finally {
			try {
				ref.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
