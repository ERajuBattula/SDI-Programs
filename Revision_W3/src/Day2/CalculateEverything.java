package Day2;

import java.util.Scanner;

public class CalculateEverything {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in)) {
			System.out.println("Write a Sentence : ");
			String str = s.nextLine();
			int digits = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
					digits++;
			}
			int small = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
					small++;
			}

			int capital = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
					capital++;
			}
			int SpcCh = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 33 && str.charAt(i) <= 47 || str.charAt(i) >= 58 && str.charAt(i) <= 64)
					SpcCh++;
			}

			int word = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ' || str.charAt(i) == '.') {
					word++;
				}
			}
			int Vowel = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
						|| str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
						|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
					Vowel++;
				}
			}
			int t = capital + small;
			System.out.println("Total Number Of Digits Present in it : " + digits);
			System.out.println("Total Small Leters : " + small + " & capital letters are : " + capital);
			System.out.println("Total number of alfabets used in it : " + t);
			System.out.println("Total Number of Special Charecters : " + SpcCh);
			System.out.println("Vowels present in the sentence : " + Vowel);
			System.out.println("Total Words present in it : " + word);
		}
	}
}
