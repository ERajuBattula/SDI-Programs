package Day2;

//Write a program to find the transpose of a given matrix.
public class TransPoseOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 2, 3, 4 }, { 4, 2, 6 }, { 5, 3, 9 } };
		int transpose[][] = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				transpose[i][j] = arr[j][i];
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
