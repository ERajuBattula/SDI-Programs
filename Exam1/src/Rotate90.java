
public class Rotate90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		System.out.println("Original Matrix : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Rotate Matrix by 90 Degrees Clockwise : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j >= 0; j--) {
				System.out.print(" " + a[j][i] +" " );
			}
			System.out.println();
		}
	}
}
