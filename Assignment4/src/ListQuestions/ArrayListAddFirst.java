//Write a Java program to insert an element into the array list at the first position.

package ListQuestions;

import java.util.*;

public class ArrayListAddFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Abhinav");
		list.add("Mahesh");
		list.add("Ravi");
		list.add("Manohar");
		list.add("Anant");
		System.out.println(list);

		System.out.println();

		list.add(0, "Omkar");
		System.out.println("Updated List is : " + list);
	}

}
