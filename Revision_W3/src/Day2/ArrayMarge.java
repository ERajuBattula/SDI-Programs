package Day2;

import java.util.Arrays;

public class ArrayMarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 8, 4, 5 };
		int arr2[] = { 6, 7, 3, 9, 0 };
		int res[] = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			res[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			res[arr1.length + i] = arr2[i];
		}
		
		Arrays.sort(res);
		System.out.println(Arrays.toString(res));
	}
}
