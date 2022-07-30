package dt_26_05_2022;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, String> UpperCase = name -> name.toUpperCase();
		System.out.println(UpperCase.apply("aniswar goutham"));
		Function<String, Integer> fetchSize = name -> name.length();
		System.out.println(fetchSize.apply("aniswar goutham"));
	}

}
