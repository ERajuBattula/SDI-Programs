import java.util.Scanner;

//write a program accept a string display only escape character
public class EscapeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Word : ");
		String wrd = s.nextLine();
		for (int i = 0; i < wrd.length(); i++) {
			if (wrd.charAt(i) == '@' || wrd.charAt(i) == '#' || wrd.charAt(i) == '$') {
				System.out.println(wrd.charAt(i));
			}
		}
	}
}
