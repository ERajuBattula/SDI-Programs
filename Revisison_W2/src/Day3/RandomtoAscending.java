package Day3;
import java.util.Arrays;
import java.util.Scanner;

//Write a program to accept numbers 1 to 10 randomly then display the ascending order.

public class RandomtoAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num[] = new int[10];
		System.out.println("Enter array elements :");
		for (int i = 0; i < 10; i++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}
}
