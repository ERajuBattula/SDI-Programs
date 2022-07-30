package dt_26_05_2022;

import java.util.function.BinaryOperator;

public class BinaryOperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Integer> substraction = (a, b) -> a - b;
		System.out.println("Result of the Substraction : " + substraction.apply(15, 5));

	}
}
