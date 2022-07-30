//Write  a  java  program  to  short  the  string objects inside a linked list considering the first char of the strings and display it.

import java.util.*;

public class LinkedListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		// Add First
		list.add("Cat");
		list.add("Tiger");
		list.add("Panda");
		list.add("Dog");
		list.add("Lion");
		list.add("Elephant");
		list.add("Koala");
		System.out.println("Original Array List : "+list);

		Collections.sort(list);
		System.out.println("Sorted Array List : "+list);

	}

}
