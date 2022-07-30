import java.util.Scanner;

public class OneDimensionalArray {
	public static int search(int array[], int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 7, 4, 9, 3, 5, 6, 8, 1 };
		for (int i : arr) {
			System.out.print(i+" ");
		}
		int x;
		System.out.println("\nEnter the key value : ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		int indexvalue = search(arr, x);
		if (indexvalue == -1)
			System.out.print("Element not Found");
		else
			System.out.println("Element " + x + " is found at index : " + indexvalue);
	}
}
