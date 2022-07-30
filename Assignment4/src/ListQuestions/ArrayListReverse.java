//Write a Java program to reverse elements in a array list.

package ListQuestions;

import java.util.*;

public class ArrayListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Abhinav");
		list.add("Mahesh");
		list.add("Ravi");
		list.add("Manohar");
		list.add("Anant");
		System.out.println("The original List is : " + list);

		System.out.println("The Reverse of this Array is : ");

		for (int i = list.size() - 1; i >= 0; i--) {

			System.out.print(list.get(i) + " ");
		}
	}

}
