// Write a Java program to append the specified element to the end of a linked list and iterate it in reverse order.

package SetQuestions;

import java.util.*;

public class ReverseLinkedList {

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

		System.out.println();

		lists.add("JackFruit");
		System.out.println("After adding element to the end. The List is : " + lists);

		System.out.println();

		System.out.println("Reverse Iterated Order Of The List is : ");

		Collections.reverse(lists);
		for (String a : lists) {
			System.out.print(a + " ");

		}
	}

}
