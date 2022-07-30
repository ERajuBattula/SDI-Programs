package Day2;

import java.util.Arrays;

//Write a program to store some value in array and display minimum number.
public class MinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 8, 5, 9, 1 };

		// Method-1
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The minimum value in array : " + min);

		// Method-2
		Arrays.sort(arr);
		System.out.println("The minimum value in array : " + arr[0]);

	}
}
