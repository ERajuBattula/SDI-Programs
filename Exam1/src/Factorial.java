import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a = s.nextInt();
		int foctorial = 1;

		for (int i = 1; i <= a; i++) {
			foctorial *= i;
		}
		System.out.println(foctorial);
	}
}
