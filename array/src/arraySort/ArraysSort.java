package arraySort;
import java.util.Arrays;
public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[] {7,10,4,3,20,15};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
	}
		Arrays.sort(arr);
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		}
}