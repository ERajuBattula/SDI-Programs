import java.util.Scanner;

//write a program accept a string and display particular character in a string and display the number of count.
public class PerticularCharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word = s.nextLine();
		String Word=word.toLowerCase();

		System.out.println("Finding Charecter : ");
		char c = s.next().charAt(0);
		int count = 0;
		for (int i = 0; i < Word.length(); i++) {
			if (Word.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("Number of Char Present : "+count);
	}

}


