package revision;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Vowel = 0, NonVowel = 0;

		for (char c = 'A'; c <= 'Z'; c++) {

			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				Vowel++;
			} else
				NonVowel++;
		}
		System.out.println("Number of Vowels: " + Vowel);
		System.out.println("Number of NonVowels: " + NonVowel);
	}
}
