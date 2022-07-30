package Interfaces;

import java.util.function.BinaryOperator;

class E implements BinaryOperator<Integer> {

	@Override
	public Integer apply(Integer t, Integer u) {
		// TODO Auto-generated method stub
		return t - u;
	}

}

public class BinaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E lsd = new E();
		System.out.println(lsd.apply(12, 2));

		BinaryOperator<Integer> lsd1 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t + u;
			}

		};
		System.out.println(lsd1.apply(13, 2));

		BinaryOperator<Integer> lsd2 = (t, u) -> t * u;
		System.out.println(lsd2.apply(3, 2));
	}

}
