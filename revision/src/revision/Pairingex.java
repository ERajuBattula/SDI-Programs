package revision;

public class Pairingex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 8, 7, 10, 4, 6, 1 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == 12) {
					System.out.println("Pair found (" + nums[i] + "," + nums[j] + ")");
				}
			}

		}
		System.out.println("pair not found");
	}
}
