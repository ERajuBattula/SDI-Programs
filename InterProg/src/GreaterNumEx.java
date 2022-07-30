import java.util.Scanner;

//Write a program to enter 3 numbers from users & find the Greater of the 3 numbers.

public class GreaterNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the first value : ");
			a = s.nextInt();
			System.out.println("Enter the second value : ");
			b = s.nextInt();
			System.out.println("Enter the third value : ");
			c = s.nextInt();
		}
			for (int i = 1; i <= 3; i++) {
			if (a < b) {
				System.out.println(b);
			} else if (b < c) {
				System.out.println(c);
			} else
				System.out.println(a);
		}
	}

}
