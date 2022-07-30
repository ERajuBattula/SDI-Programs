package revision;

import java.util.Scanner;

public class DisplayCharEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		try (Scanner sc = new Scanner(System.in)) {
			int chr = sc.nextInt();
			char asciiValue = (char)chr;
			System.out.println("ASCII value of " +chr+ " is: "+asciiValue);
		}
	
	}

}
