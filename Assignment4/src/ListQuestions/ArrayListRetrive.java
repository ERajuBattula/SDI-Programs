//Write a Java program to retrieve an element (at a specified index) from a given array list

package ListQuestions;

import java.util.*;

public class ArrayListRetrive {

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
		String n = list.get(2);
		System.out.println("Element in the given Index Number is : " + n);
	}

}
