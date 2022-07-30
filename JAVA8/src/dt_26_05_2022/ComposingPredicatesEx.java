package dt_26_05_2022;

import java.util.function.Predicate;

public class ComposingPredicatesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> startsWith = text -> text.startsWith("L");
		Predicate<String> endsWith = text -> text.endsWith("a");
		Predicate<String> startsWithAndendsWith = text -> startsWith.test(text) && endsWith.test(text);
		System.out.println(startsWithAndendsWith.test("Lalita"));

		Predicate<String> startsWith1 = text -> text.startsWith("M");
		Predicate<String> endsWith1 = text -> text.endsWith("i");
		Predicate<String> startsWithOREndsWith = startsWith1.or(endsWith1);
		System.out.println(startsWithOREndsWith.test("Manashi"));
	}

}
