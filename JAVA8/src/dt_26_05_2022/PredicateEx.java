package dt_26_05_2022;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> contain = name -> name.contains("l");
		System.out.println("Abhilash contains char L : " + contain.test("Abhilash"));
		System.out.println("Anita contains char L : " + contain.test("Anita"));
	}

}
