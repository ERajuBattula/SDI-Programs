package revision;

import java.util.Scanner;

public class Vowelex {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a Charecter : ");
			char c = sc.next().charAt(0);
			switch (c) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				System.out.println("It is a Vowel...");
				break;
			default:
				System.out.println("It is not a Vowel...");
				break;
			}
		}
	}
}
