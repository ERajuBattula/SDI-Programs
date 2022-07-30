package Day3;
import java.util.Scanner;

//Write a program accept a string & display number of consonant characters and special characters.

public class ConsonantCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int consonant=0;
		int SpecChar=0;
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == '@' || name.charAt(i) == '#' || name.charAt(i) == '$' || name.charAt(i) == '*'
					|| name.charAt(i) == '&') {
				SpecChar++;
			} else if (name.charAt(i) != 'A' || name.charAt(i) != 'E' || name.charAt(i) != 'I' || name.charAt(i) != 'O'
					|| name.charAt(i) != 'U' || name.charAt(i) != 'a' || name.charAt(i) != 'e' || name.charAt(i) != 'i'
					|| name.charAt(i) != 'o' || name.charAt(i) != 'u') {
				consonant++;
			}
		}
		System.out.println("Special Carecters are : "+SpecChar);
		System.out.println("Consonants are : "+consonant);
	}
}
