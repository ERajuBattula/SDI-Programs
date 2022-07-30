package Day2;

//Write a program to add two Matrices.
public class AddMatrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ari[][] = { { 2, 3, 4 }, { 4, 2, 6 } };
		int arj[][] = { { 1, 5, 3 }, { 6, 3, 5 } };
		int arr[][] = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = ari[i][j] + arj[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
