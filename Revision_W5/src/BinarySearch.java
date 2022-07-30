
public class BinarySearch {
	public static void findRecursively(int arr[], int Start, int End, int Search) {
		if (Start > End) {
			return;
		}
		int mid = (Start + End) / 2;
		if (arr[mid] == Search) {
			System.out.println("The " + Search + " is at the position of " + mid+".");
			return;
		} else if (Search > arr[mid]) {
			findRecursively(arr, mid + 1, End, Search);
		} else{
			findRecursively(arr, Start, mid - 1, Search);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,5,8,9,10};
		int Start=0;
		int End=arr.length-1;
		int Search=9;
		findRecursively(arr,Start,End,Search);
	}
}
