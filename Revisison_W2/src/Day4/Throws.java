package Day4;

import java.io.*;

public class Throws {
	public static void findFile() throws IOException {
		File newFile = new File("D:\\test.txt");
		FileInputStream stream = new FileInputStream(newFile);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
