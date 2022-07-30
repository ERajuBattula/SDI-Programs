package Day2;

import java.util.Scanner;

public class InsertName {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			System.out.println("Enter Your First Name : ");
			String fn=s.nextLine();
			System.out.println("Enter Your Last Name : ");
			String ln=s.nextLine();
			System.out.println("Displaying your name : "+fn.charAt(0)+"."+ln);
		}
	}
}
