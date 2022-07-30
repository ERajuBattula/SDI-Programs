package revision;
//WAP to accept 20 character and display the number of vowel and no of non vowel:-
import java.util.Scanner;

public class VowelCountEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		int Vowels, NonVowels, length;
		length = 1;
		Vowels = NonVowels = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Charecters : ");
			while (length <= 20) {
				ch = sc.next().charAt(0);
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
						|| ch == 'o' || ch == 'u') {
					Vowels++;
				} else {
					NonVowels++;
				}
				length++;
			}
		}
		System.out.println("Count of Vowels: " + Vowels);
		System.out.println("Count of NonVowels: " + NonVowels);
	}
}
