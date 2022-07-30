package dt_26_05_2022;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> obj = num -> ++num;
		System.out.println(obj.apply(12));

		UnaryOperator<Integer> doubleTheNumb = num -> num + num;
		System.out.println("incrementUnaryOperator -> " + doubleTheNumb.apply(6));

		System.out.println(obj.andThen(doubleTheNumb).apply(5));

	}

}
