
//Write a program to enter numbers till the user wants. At the end it should display the count of positive, negative and zeros entered.
import java.util.Scanner;

public class CountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int positive = 0;
		int negetive = 0;
		int zero = 0;
		int num;
		int number = 1;

		System.out.println("enter the series of numbers: ");
		try (Scanner s = new Scanner(System.in)) {
			num = s.nextInt();
		}
		for (int i = 1; i <= num; i++) {
			System.out.println("enter the number" + number + ": ");
			try (Scanner sc = new Scanner(System.in)) {
				int a = sc.nextInt();
				number++;

				if (a > 0) {
					positive++;
				} else if (a < 0) {
					negetive++;
				} else if (a == 0) {
					zero++;
				} else {
					System.out.println("wrong entry");
					break;
				}
			}

		}
		System.out.println("The positive number : " + positive);
		System.out.println("The negetive number : " + negetive);
		System.out.println("The zero number : " + zero);

	}

}
