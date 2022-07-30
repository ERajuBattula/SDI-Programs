package revision;

import java.util.Scanner;

public class DisplayCharEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int a;
	        try (Scanner sc = new Scanner(System.in)) {
				a = sc.nextInt();
			}
	        while (a <= 90) {
	            char ch = (char) a;
	            System.out.print(ch+" = "+a);
	            a++;
	            System.out.println( );
	        }
	}

}
