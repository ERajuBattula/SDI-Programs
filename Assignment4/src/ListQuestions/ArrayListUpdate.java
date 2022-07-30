// Write a Java program to update specific array element by given element.

package ListQuestions;

import java.util.*;

public class ArrayListUpdate {

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

		list.set(3, "KulDeep");
		System.out.println("new list is : " + list);
	}

}
