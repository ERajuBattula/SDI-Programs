package Interfaces;

import java.util.function.UnaryOperator;

class F implements UnaryOperator<Integer> {

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		return ++t;
	}

}

public class UnaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F sup = new F();
		System.out.println(sup.apply(5));

		UnaryOperator<Integer> sup1 = new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return --t;
			}

		};
		System.out.println(sup1.apply(7));

		UnaryOperator<Integer> sup2 = t -> t * t;
		System.out.println(sup2.apply(3));
	}

}
