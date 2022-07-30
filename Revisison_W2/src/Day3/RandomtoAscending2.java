package Day3;
import java.util.Arrays;
import java.util.Scanner;

//Write a program to accept characters A to Z randomly then display the ascending order.
public class RandomtoAscending2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Index length : ");
		int n = sc.nextInt();
		char arr[] = new char[n];
		System.out.println("Input Array Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next().charAt(0);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
