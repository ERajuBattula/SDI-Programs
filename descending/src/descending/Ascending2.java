package descending;

import java.util.Arrays;

public class Ascending2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 3, 2 };
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println("Array in Ascending Order : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
