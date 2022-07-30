package descending;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 3, 2 };
		int n = arr.length;
		System.out.println("Elements of original array : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println();
		}

		System.out.println("Elements of array sorted in Ascending order : ");
		for (int j = 0; j < n; j++) {
			System.out.print(arr[j] + "  ");
		}
	}
}

