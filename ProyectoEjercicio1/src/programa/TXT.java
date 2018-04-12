package programa;

import java.io.*;

import java.nio.file.Paths;

public class TXT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File ("C:/Users/Java/Documents/prueba.txt");
		File folder = new File("C:/Users/Java/Documents/abc");
		
		System.out.println("File exists?" + file.exists());
		
		System.out.println(file.exists());
		System.out.println(folder.mkdir());
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
