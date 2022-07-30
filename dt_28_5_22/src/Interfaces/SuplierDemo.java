package Interfaces;

import java.util.function.Supplier;

class C implements Supplier<Double> {

	@Override
	public Double get() {
		// TODO Auto-generated method stub
		return Math.random() * 100;
	}

}

public class SuplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob = new C();
		System.out.println(ob.get());

		Supplier<Double> ob1 = new Supplier<>() {

			@Override
			public Double get() {
				// TODO Auto-generated method stub
				return Math.random() * 1000;
			}

		};
		System.out.println(ob1.get());
		
		Supplier<Double> ob2=()->Math.random() * 10000;
		System.out.println(ob2.get());
	}

}
