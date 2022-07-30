import java.util.Scanner;

public class MaxNo {
	public static void main(String[] args) {
		int a, b, c;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the first value : ");
			a = s.nextInt();
			System.out.println("Enter the second value : ");
			b = s.nextInt();
			System.out.println("Enter the third value : ");
			c = s.nextInt();
		}
		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}

}
