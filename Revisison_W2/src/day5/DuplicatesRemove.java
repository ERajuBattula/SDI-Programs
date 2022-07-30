package day5;

public class DuplicatesRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					continue;
				}
				System.out.println(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
