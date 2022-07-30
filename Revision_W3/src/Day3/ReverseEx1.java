package Day3;

public class ReverseEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is Java Class";
		String[] arr = str.split(" ");
		String RevWord = "";
		String RevString = "";
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			for (int j = word.length()-1; j >= 0; j--) {
				RevWord =RevWord+ word.charAt(j);
			}
			RevString =RevString+ RevWord + " ";
		}
		System.out.println(RevString);
	}

}
