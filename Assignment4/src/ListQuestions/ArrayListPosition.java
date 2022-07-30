// Write a Java program to print all the elements of a ArrayList using the position of the elements.

package ListQuestions;

import java.util.*;

public class ArrayListPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Abhinav");
		list.add("Mahesh");
		list.add("Ravi");
		list.add("Manohar");
		list.add("Anant");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element at index " + i + ": " + list.get(i));
		}
	}

}
