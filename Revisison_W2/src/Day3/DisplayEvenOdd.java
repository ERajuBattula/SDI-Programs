package Day3;
//Write a program accept 1 to 10 series number. Display even numbers and odd numbers separately.
public class DisplayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even numbers are : ");
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("Odd numbers are : ");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(+i + " ");
			}
		}
	}
}
