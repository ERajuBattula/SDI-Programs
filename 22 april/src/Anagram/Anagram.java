package Anagram;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Silent";
		String str2 = "Listen";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram");
		} else {
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if (Arrays.equals(string1, string2) == true) {
				System.out.println("Both are Anagrams");
			} else {
				System.out.println("Not Anagram");
			}
		}
	}
}
