// Write a Java program to append the specified element to the end of a hash set and iterate through all elements in a hash list

package HasSet;

import java.util.*;

public class HasSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hasset = new HashSet<>();
		hasset.add("Cat");
		hasset.add("Rat");
		hasset.add("Cat");
		hasset.add("Red");
		hasset.add("Rabbit");
		hasset.add("Dog");
		hasset.add("Cow");
		hasset.add("Horse");
		hasset.add("Dog");

		System.out.println(hasset);

		for (String h : hasset) {
			System.out.print(h + "  ");
		}
	}

}
