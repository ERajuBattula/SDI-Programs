package revision;

import java.util.Scanner;

public class ap {

	public static void main(String[] args) {
		
		int i = 0;
		do {
			Scanner s=new Scanner(System.in);
			char a=s.next().charAt(0);
			if(a=='!') {
				return ;
			}
			i++;
		}while(i>0);

	}

}
