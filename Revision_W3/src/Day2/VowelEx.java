package Day2;

public class VowelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Spirit";
		int temp = 0;
		System.out.println("The first vowel present in the String on the position : ");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
					|| s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				temp++;
				System.out.println(String.valueOf(i+1));
				break;
			}
		}
		if(temp==0) {
			System.out.println("Sorry No Vowels..");
		}
	}
}
