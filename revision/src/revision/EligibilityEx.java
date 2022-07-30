package revision;

//Write a program to accept a person age and display the perso is wether eligible for voting or not.
import java.util.Scanner;

public class EligibilityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Age..(In Numbers...) :-");
			age = sc.nextInt();
		}
		if (age >= 18) {
			System.out.println("Person Is Eligible For Vote.");
		} else
			System.out.println("Person Is Not Eligible For Vote.");
	}
}
