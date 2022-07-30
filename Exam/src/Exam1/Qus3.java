package Exam1;
import java.util.Arrays;

public class Qus3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 7, 6, 8, 9, 1, 3, 5 };
		System.out.println("Odd Number Are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			} 
		}
		System.out.println();
		System.out.println("Odd Number Are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			} 
		}
	}
}
