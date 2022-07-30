package Interfaces;

import java.util.function.Function;

class A implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}

}

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		System.out.println(obj.apply("Amit"));

		Function<String,Integer> obj1= new Function<String,Integer>(){

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return t.length();
			}
			
		};
		System.out.println(obj1.apply("Arabind"));
		
		Function<String,Integer> obj2= t->t.length();
		System.out.println(obj2.apply("ashit"));
	}

}
