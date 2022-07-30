import java.util.Scanner;

//Two numbers are entered by user x & n. write a function to find the value of one number raised to the power of another is that x^n.
public class PowerOfNEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the x value : ");
			int x = sc.nextInt();
			System.out.println("Enter the n value : ");
			int n = sc.nextInt();
			int result = (int) Math.pow(x, n);

			System.out.println("Answer = " + result);
		}
	}

}
