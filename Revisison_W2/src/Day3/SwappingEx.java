package Day3;
import java.util.Scanner;

//Write a program accept 2 number and display swapping numbers.

public class SwappingEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of B : ");
		int b = sc.nextInt();
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Value of A : "+a);
		System.out.println("Value of B : "+b);
	}
}
