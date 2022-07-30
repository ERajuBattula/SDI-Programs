package Day1;

//import java.util.Arrays;

public class PositiveNagative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 3, -2, -6, -8, 5, -4 };
		// Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
		System.out.println("Odd numbers are : ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Even numbers are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
