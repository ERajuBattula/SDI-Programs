package Day2;

//Write a program to print duplicate number in an  array.
public class DuplicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 4, 3, 8, 9, 7, 4 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Repeated Values are : "+arr[i]);
				}
			}
		}
	}
}
