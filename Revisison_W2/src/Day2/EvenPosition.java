package Day2;
//Write a program to print the even position in an array.
public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 8, 5, 9, 1 };
		for(int i=1;i<arr.length;i+=2) {
			System.out.print(arr[i]+" ");
		}
	}
}
