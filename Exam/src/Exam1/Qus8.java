package Exam1;
import java.util.Scanner;

public class Qus8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flag = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number..");
		int n = s.nextInt();
		if (n == 0 || n == 1) {
			System.out.println(n + " is not a prime number");
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime number");
					flag++;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is a prime number");
				
			}
		}
	}
}
