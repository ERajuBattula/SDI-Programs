package LinkedList;

import java.util.*;

public class LListExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
//Add First
		list.addFirst("Cat");
		list.addFirst("Dog");
		System.out.println(list);
//Add Last
		list.add("Lion");
		list.add("Tiger");
		System.out.println(list);
//Add in the Middle
		list.add(2, "Elephant");
		list.add(3, "Cow");
		System.out.println(list);
//Delete from First
		list.remove();
		System.out.println(list);
//Delete from last
		list.removeLast();
		System.out.println(list);
//Delete in the middle
		list.remove(2);
		System.out.println(list);
		System.out.println();
//Size of the List
		System.out.println("Size of the LinkedList : " + list.size());

		System.out.println("First element of a list :- " + list.element());

		System.out.println("getLast of a list :- " + list.getLast());

		System.out.println("getFirst of a list :- " + list.getFirst());
	}

}
