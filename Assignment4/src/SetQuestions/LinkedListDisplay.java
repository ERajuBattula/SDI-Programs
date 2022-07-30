//Write a Java program to display the elements and their positions in a linked list.

package SetQuestions;

import java.util.*;

public class LinkedListDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lists = new LinkedList<String>();
		lists.add("Apple");
		lists.add("Mango");
		lists.add("Banana");
		lists.add("Grapes");
		lists.add("Coconut");
		lists.add("Cherry");
		System.out.println(lists);

		for (int i = 0; i < lists.size(); i++) {
			System.out.println("Element at index " + i + ": " + lists.get(i));
		}
	}

}
