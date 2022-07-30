import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<String>();

		// Adding elements
		ts.add("Sachin");
		ts.add("Amar");
		ts.add("Gita");
		ts.add("Suman");
		ts.add("Baman");
		ts.add("Vasu");
		ts.add("Harish");
		ts.add("Maya");
		ts.add("jatin");
		ts.add("Mona");
		ts.add("Darsana");

		System.out.println("Tree Set is : " + ts);

		System.out.println("Size of the set : " + ts.size());

		System.out.println(ts.contains("Mona"));

		System.out.println(ts.headSet("Sachin"));

		System.out.println("First Value : " + ts.first());

		System.out.println("Last Value : " + ts.last());

		System.out.println(ts.tailSet("Maya"));

		System.out.println(ts.subSet("Baman", true, "Maya", true));

		ts.pollLast();
		System.out.println("After Deleting Last Element" + ts);
		ts.pollFirst();
		System.out.println("After Deleting First Element" + ts);

	}
}