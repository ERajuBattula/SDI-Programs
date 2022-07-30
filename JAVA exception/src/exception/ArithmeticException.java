package exception;

public class ArithmeticException {
	public static void main(String[] args) {
		try {
			int a = 20;
			int b = 0;
			int c = a / b;

			System.out.println("output will be : " + c);
		} catch (Exception e) {

			System.out.println("Exception Found - " + e.getMessage());
		} finally {
			System.out.println("Program Execution Sucessfull...");
		}
	}
}
