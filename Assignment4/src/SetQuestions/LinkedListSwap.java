//Write a Java program of swap two elements in a linked list.

package SetQuestions;

import java.util.*;

public class LinkedListSwap {

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

		Collections.swap(lists, 3, 1);
		System.out.println(lists);
	}

}
