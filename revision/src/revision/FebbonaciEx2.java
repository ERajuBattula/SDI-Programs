package revision;

public class FebbonaciEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 1;
		System.out.print(n1 + " " + n2);

		for (n2=1;n2<=189;++n2)
		{
			n2=n1+n2;
			n1=n2-n1;
			System.out.print(" " + n2);
			
		}
	}

}
