package ArrayList;

import java.util.*;

public class AlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();

//Add String in Last Position
		a.add("Stark");
		a.add("Wanda");
		System.out.println(a);

//Add String in First Position
		a.add(0, "Vision");
		System.out.println(a);

//Add String In Random Position
		a.add(1, "Peter");
		a.add(3, "Natasha");
		System.out.println(a);

//Remove Random Element
		a.remove(2);
		System.out.println(a);

//Replace the Name in Random Position
		a.set(0, "Charlie");
		System.out.println(a);

//To print any random Element
		System.out.println(a.get(2));

		Collections.sort(a);
		System.out.println(a);

	}

}
