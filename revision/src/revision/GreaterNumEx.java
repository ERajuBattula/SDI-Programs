package revision;
//write a program to accept the three numbers and display greater number.
import java.util.Scanner;

public class GreaterNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value of 'a' : ");
			a = sc.nextInt();
			System.out.println("Enter the value of 'b' : ");
			b = sc.nextInt();
			System.out.println("Enter the value of 'c' : ");
			c = sc.nextInt();
		}
		if (a < b && b < c) {
			System.out.println(c + " : is the greater number...");
		} else if (a > b && b > c) {
			System.out.println(a + " : is the greater number...");
		} else {
			System.out.println(b + " : is the greater number...");
		}
	}
}
