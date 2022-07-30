//Write a java program to implement methods of tree map.

import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> tree = new TreeMap<>();
		tree.put("Amar", 234);
		tree.put("Vasu", 134);
		tree.put("Rama", 453);
		tree.put("Shyam", 653);
		tree.put("Banita", 908);
		tree.put("Aruna", 969);
		tree.put("Muna", 817);
		tree.put("Juli", 504);
		System.out.println(tree);

		System.out.println(tree.descendingMap());

		System.out.println(tree.headMap("Rama", true));

		System.out.println(tree.tailMap("Banita"));

		System.out.println(tree.size());
	
	}

}
