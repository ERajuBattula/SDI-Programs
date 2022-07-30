package Day1;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ramaRAMArama";
		int a = 0, r = 0, m = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				a++;
			} else if (str.charAt(i) == 'r' || str.charAt(i) == 'R') {
				r++;
			} else {
				m++;
			}
		}
		System.out.println("A is repeated " + a + " Number of times.");
		System.out.println("R is repeated " + r + " Number of times.");
		System.out.println("M is repeated " + m + " Number of times.");
		System.out.println();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'r') {
				str.replace(str.charAt(i), 'R');
			} else if (str.charAt(i) == 'R') {
				str.replace(str.charAt(i), 'r');
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				continue;
			}
			System.out.print(str.charAt(i));
		}
	}
}
