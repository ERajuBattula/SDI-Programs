package Exam1;

import java.util.Arrays;

public class Qus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 4;
		arr[2] = 9;
		arr[3] = 7;
		arr[4] = 2;
		System.out.println("The input Array is :  " + Arrays.toString(arr));

		System.out.println();

		int n = arr.length;
		int nArr[] = new int[n + 1];
		int value = 10;
		for (int i = 0; i < n; i++) {
			nArr[i] = arr[i];
		}
		nArr[n] = value;
		System.out.println("The Output Array is : " + Arrays.toString(nArr));
	}
}
