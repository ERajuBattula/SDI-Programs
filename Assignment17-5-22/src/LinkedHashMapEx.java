//Write a java program to insert and display the elements inside the linked hash map.

import java.util.*;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> mapEx = new LinkedHashMap<>();
		mapEx.put(1, "One");
		mapEx.put(5, "Five");
		mapEx.put(4, "Four");
		mapEx.put(9, "Nine");
		mapEx.put(2, "Two");
		mapEx.put(7, "Seven");
		System.out.println(mapEx);

		System.out.println("-------------------------------------------------");
		Set<Map.Entry<Integer, String>> entries = mapEx.entrySet();
		Iterator<Map.Entry<Integer, String>> iter = entries.iterator();
		while (iter.hasNext()) {
			System.out.println("--------------------------------");
			System.out.println("Keay=Value");
			Map.Entry<Integer, String> curEntry = iter.next();
			System.out.println(curEntry);
			System.out.println(curEntry.getKey());
			System.out.println(curEntry.getValue());
		}

	}

}
