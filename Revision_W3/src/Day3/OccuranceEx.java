package Day3;

import java.util.Scanner;

public class OccuranceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = s.nextLine();
		String str1 = str.toLowerCase();
		System.out.print("Enter a Character (in lower case) : ");
		char c = s.next().charAt(0);
		int count = 0;

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(c + " is occured in the string " + count + " times.");
	}
}
