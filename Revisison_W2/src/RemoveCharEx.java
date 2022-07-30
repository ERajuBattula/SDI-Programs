import java.util.Scanner;

public class RemoveCharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Word : ");
		String Word = s.nextLine();
		System.out.println("Character you want to remove : ");
		char c = s.next().charAt(0);
		System.out.println("After Removal of Character : ");
		
		for (int i = 0; i < Word.length(); i++) {
			if (Word.charAt(i) == c) {
				System.out.println(Word.replace(c, ' '));
			}
		}
	}
}
