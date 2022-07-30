package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Values : ");
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}
		int even = 0, odd = 0;

		int EvenArr[] = new int[5];
		int OddArr[] = new int[5];
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even += num[i];
				EvenArr[i] = num[i];
			} else {
				OddArr[i] = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				odd += num[i];
			}
		}
		double x = even / odd;
		System.out.println("Even Numbers Are : " + Arrays.toString(EvenArr));
		System.out.println("Odd Numbers Are : " + Arrays.toString(OddArr));
		System.out.println("Sum of Even Numbers Are : " + even);
		System.out.println("Sum of Odd Numbers Are : " + odd);
		System.out.println("Even Sum/Odd Sum : " + x);
	}

}
