package revision;

import java.util.Scanner;

public class DisplayCharEx2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Ascii Value : ");
			int Ascii = s.nextInt();
			String Char = Character.toString(Ascii);
			System.out.println(Ascii + " Converted to " + Char);
			
		}
	}
}
