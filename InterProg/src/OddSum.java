
//Write a Program to print a sum of all odd numbers from 1 to
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class OddSum {
	public static void main(String[] args) {
		int m, n;
		int sum = 0;
		System.out.print("Enter No of Elemets: ");
		try (Scanner s = new Scanner(System.in)) {
			n = s.nextInt();
		}
// List<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			m = 2 * i - 1;
// arr.add(m);
			System.out.print(m + " ");
			sum += m;
		}
// System.out.println(arr);
		System.out.println("\nSum is: " + sum);
	}
}
