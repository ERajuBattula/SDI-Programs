package dt_26_05_2022;

import java.util.function.Supplier;

public class SuplierInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> s = new Supplier<>() {

			@Override
			public Double get() {
				// TODO Auto-generated method stub
				return Math.random() * 100;
			}

		};
		System.out.println("Random number picked : " + s.get());

	}

}
