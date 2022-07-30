package Exam1;
import java.util.Scanner;

public class Qus10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Sentence.");
		String b = s.nextLine();
		int space = 0;
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == ' ') {
				space++;
			}
		}
		System.out.println("Number of White Spaces : " + space);
	}
}
