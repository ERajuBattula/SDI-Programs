package Exam1;

public class Qus4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, -2, 7, 6, -8, 9, 1, 3, -5 };
		int sum = 0;
		System.out.println("Sum of positive numbers : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
}
