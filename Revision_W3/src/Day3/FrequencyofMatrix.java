package Day3;

public class FrequencyofMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Odd = 0, Even = 0;
		int a[][] = { { 4, 1, 3 }, { 3, 5, 7 }, { 8, 2, 6 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] % 2 == 0)
					Even++;
				else
					Odd++;
			}
		}
		System.out.println("Frequency of odd numbers: " + Odd);
		System.out.println("Frequency of even numbers: " + Even);
	}
}
