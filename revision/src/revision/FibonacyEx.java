package revision;

public class FibonacyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 1;

		System.out.println(n1);
		while (n2 <= 189) {
			System.out.println(n2);
			n2 = n1 + n2;
			n1 = n2 - n1;
		}
	}
}
