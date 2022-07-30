import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int num = sc.nextInt();
        int n = num;
        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                int d = n % 10;
                sum += d;
                n /= 10;
            }
            n = sum;
        }

        if (n == 1)
            System.out.println(num + " is a Magic Number");
        else
            System.out.println(num + " is not a Magic Number");
	}
}
