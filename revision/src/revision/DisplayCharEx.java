package revision;

public class DisplayCharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ascii = 65;

		for (int i = ascii; i <= 90; i++) {
			String convertedChar = Character.toString(i);
			System.out.println(i + " => " + convertedChar);
		}
	}
}
