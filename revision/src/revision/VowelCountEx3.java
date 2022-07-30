package revision;

//Write a program to accept a character until '!' is not accepted then display weather the number of vowels are greater than non vowels or lesser than non vowels.

import java.util.Scanner;

public class VowelCountEx3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = ' ';
		int Vowels, NonVowels;
		Vowels = 0;
		NonVowels = -1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Charecters : ");
			while (ch != '!') {
				ch = sc.next().charAt(0);
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
						|| ch == 'o' || ch == 'u') {
					Vowels++;
				} else {
					NonVowels++;
				}
			}
			if (Vowels > NonVowels) {
				System.out.println("Vowels are greater than NonVowels.");
			} else if (Vowels < NonVowels) {
				System.out.println("Vowels are lesser than NonVowels.");
			} else
				System.out.println("Vowels are equal to Non Vowels.");
		}
	}
}
