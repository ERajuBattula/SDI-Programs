package Day1;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("C:\\Users\\ESC202204JAVA22\\Desktop\\input.txt");
			out = new FileOutputStream("C:\\Users\\ESC202204JAVA22\\Desktop\\output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
