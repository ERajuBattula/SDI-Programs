package Interfaces;

import java.util.function.Predicate;

class D implements Predicate<String> {

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		if (t.contains("o")) {
			return true;
		}
		return false;
	}

}

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D lst = new D();
		System.out.println(lst.test("Lalita"));
		System.out.println(lst.test("Mango"));

		Predicate<String> lst1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				if (t.contains("k")) {
					return true;
				}
				return false;
			}

		};
		System.out.println(lst1.test("Lucky"));

		Predicate<String> lst2 = t -> t.contains("p");

		System.out.println(lst2.test("lopa"));
	}

}
