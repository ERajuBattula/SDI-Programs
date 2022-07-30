package Exam1;
import java.util.Scanner;

public class Qus9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Sentence.");
		String b=s.nextLine();
		int word=0;
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)==' '||b.charAt(i)=='.' ) {
				word++;
			}
		}
		System.out.println("Number of Words : "+word);
	}
}
