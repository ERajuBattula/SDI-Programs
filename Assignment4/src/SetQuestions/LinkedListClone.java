//Write a Java program to clone an linked list to another linked list.

package SetQuestions;

import java.util.*;

public class LinkedListClone {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lists = new LinkedList<String>();
		lists.add("Apple");
		lists.add("Mango");
		lists.add("Banana");
		lists.add("Grapes");
		lists.add("Coconut");
		lists.add("Cherry");
		System.out.println("The Original list: " + lists);

		LinkedList<String> Clone = new LinkedList<String>();
		// lists.addAll(Clone);
		Clone = (LinkedList<String>) lists.clone();
		System.out.println("The Cloned list  : " + Clone);
	}

}
