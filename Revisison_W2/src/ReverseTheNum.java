
public class ReverseTheNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 731;
		int rev = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num /= 10;
		}
		System.out.println(rev);
	}
}
