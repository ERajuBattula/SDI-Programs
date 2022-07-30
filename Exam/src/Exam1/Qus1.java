package Exam1;
import java.util.Arrays;

public class Qus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 8, 6, 1, 9, 4 };

		// method-1
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The second largest number is : " + arr[arr.length - 2]);

		// method-2
		Arrays.sort(arr);
		System.out.println("The second largest number is : " + arr[arr.length - 2]);
	}
}
