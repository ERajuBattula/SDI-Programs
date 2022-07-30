package Day4;

public class ThrowEx {
	public static void DevidebyZero(int i) {
		int a = i / 0;
		throw new ArithmeticException("Devide by zero.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DevidebyZero(6);
	}
}
