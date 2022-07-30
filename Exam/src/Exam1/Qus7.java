package Exam1;
import java.util.Scanner;

public class Qus7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter value of first Integer : ");
		int a=s.nextInt();
		System.out.println("Enter value of Second Integer : ");
		int b=s.nextInt();
		System.out.println("Value of first Integer before swapping : "+a);
		System.out.println("Value of Second Integer before swapping : "+b);
		System.out.println();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of first Integer after swapping : "+a);
		System.out.println("Value of Second Integer after swapping : "+b);
	}
}
