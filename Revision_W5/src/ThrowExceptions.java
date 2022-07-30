import java.util.Scanner;

public class ThrowExceptions {
	static void Examine() throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = s.nextInt();
		if (age < 18) {
			throw new Exception("Age must be greater than 18.");
		} else {
			System.out.println("You are eligible to enter..");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Examine();
	}
}
