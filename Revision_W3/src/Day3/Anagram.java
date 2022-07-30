package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first word : ");
		String str1 = s.nextLine();
		str1 = str1.toLowerCase();
		System.out.print("Enter the second word : ");
		String str2 = s.nextLine();

		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);

		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram");
		} else {
			if (Arrays.equals(string1, string2)) {
				System.out.println("Both are Anagrams");
			} else {
				System.out.println("Not Anagram");
			}
		}
	}
}
