package Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class B implements Consumer<String> {

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t + " ");
	}

}

public class ConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obc = new B();
		List<String> str = Arrays.asList("Vaibhav", "Anuj", "Ankit");

		str.forEach(obc);

		System.out.println("------------------------------------------");

		Consumer<String> obc1 = new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t + " ");
			}

		};
		str.forEach(obc1);
		System.out.println("-------------------\"hlw\"-----------------------");

		Consumer<String> obc2 = t -> System.out.println(t + " ");
		str.forEach(obc2);

	}

}
