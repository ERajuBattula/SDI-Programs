package Day3;
//Java program to right rotate the elements of an Array.
import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		
		for (int i = 0; i <2; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
