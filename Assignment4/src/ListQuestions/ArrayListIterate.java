//Write a Java program to iterate through all elements in a array list.

package ListQuestions;

import java.util.*;

public class ArrayListIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Abhinav");
		list.add("Mahesh");
		list.add("Ravi");
		list.add("Manohar");
		list.add("Anant");
		System.out.println(list);

		for (String a : list) {
			System.out.print(a + " ");

		}
		// Iterator<String>iterator=list.iterator();
		// while(iterator.hasNext()) {
		// String next=itertor.next();
		// System.out.println("Each Element in the list is : "+next);
		// }
	}

}
