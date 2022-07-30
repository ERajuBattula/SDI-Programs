package exception;

public class NegativeArraySizeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[-6];
		arr[1] = 3;
		System.out.println("Value at the Index Value 1 is : " + arr[1]);
	}
}
