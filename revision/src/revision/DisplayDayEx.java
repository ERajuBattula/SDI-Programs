package revision;
//Write a program to accept a number and display corresponding Day.
import java.util.Scanner;

public class DisplayDayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number : ");
		int s;
		try (Scanner a = new Scanner(System.in)) {
			s = a.nextInt();
		}
		if (s == 1) {
			System.out.println("SunDay");
		} else if (s == 2) {
			System.out.println("MonDay");
		} else if (s == 3) {
			System.out.println("TuesDay");
		} else if (s == 4) {
			System.out.println("WednesDay");
		} else if (s == 5) {
			System.out.println("ThursDay");
		} else if (s == 6) {
			System.out.println("FriDay");
		} else if (s == 7) {
			System.out.println("SaturDay");
		} else {
			System.out.println("Error....Invalid Entry...");
		}
	}
}
