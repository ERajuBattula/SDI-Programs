package java8;

interface Lambda {
	void square(int x);
}

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda l = x -> System.out.println("Squre of the number is : " + x * x);
		l.square(4);
	}

}
