import java.util.Scanner;

//Write a program accept a string and accept character remove the given character in a string and display String
public class RemoveCharEx2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a String : ");
		String name = s.nextLine();
		System.out.println("Enter a charcater to remove : ");
		char c = s.next().charAt(0);
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == c) {
				continue;
			}
			System.out.print(name.charAt(i));
		}
	}
}
