package revision;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			char ch;
			System.out.println("Enter a Vowel...");
			ch = sc.next().charAt(0);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				System.out.println(ch + " : Is a Vowel...");
			} else
				System.out.println(ch + " : Is not a Vowel..");
		}
	}
}
