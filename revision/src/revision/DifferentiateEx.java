package revision;

import java.util.Scanner;

class Differ {
	void check(int i, int j) {
		if (i < j) {
			System.out.println(j + " is greater than " + i+" .");
		} else if (i > j) {
			System.out.println(i + " is greater than " + j+" .");

		} else {
			System.out.println(i + " is equals to " + j+" .");
		}
	}
}
public class DifferentiateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Differ obj = new Differ();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first Value : ");
			int a = sc.nextInt();
			System.out.println("Enter Second Value : ");
			int b = sc.nextInt();
			obj.check(a, b);
		}
	}
}
