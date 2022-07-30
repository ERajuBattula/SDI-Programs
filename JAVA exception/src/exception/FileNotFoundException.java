package exception;

import java.io.FileReader;

public class FileNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileReader fileReader = new FileReader("Boomer.txt");
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured : " + e.getMessage());
		}
	}

}
