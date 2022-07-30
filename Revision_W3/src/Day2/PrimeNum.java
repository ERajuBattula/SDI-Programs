package Day2;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;

		for (int i = 2; i < 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (count <= 10) {
				if (flag == true) {
					System.out.println(i);
					count++;
				}
			}
		}
	}
}
