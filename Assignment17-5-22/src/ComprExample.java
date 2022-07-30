//Write  a  java  program  to make  a  list  of  student  objects  having attributes id and name and make two comparator implementations to short them on the id basis and name basis.

import java.util.*;

class Students {
	private String Name;
	private int Id;

	Students(String name, int id) {
		this.Name = name;
		this.Id = id;
	}

	public String getName() {
		return Name;
	}

	public int getId() {
		return Id;
	}

	@Override
	public String toString() {
		return "Student Details [name=" + Name + ", Id num=" + Id + "]";
	}

}

class NameSort implements Comparator<Students> {
	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}

class IdSort implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		}
		return 0;
	}

}

public class ComprExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> list = new ArrayList<>();
		list.add(new Students("Bhagirath Sahu", 2314));
		list.add(new Students("Abhinash Mallik", 3675));
		list.add(new Students("Sunaina Jena", 4532));
		list.add(new Students("Rudraksh Saha", 5341));
		list.add(new Students("Kunja Mohanta", 7512));

		for (Students s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------------------------------------------------");
		Collections.sort(list, new NameSort());
		for (Students st : list) {
			System.out.println(st);
		}
		System.out.println("------------------------------------------------------------------");
		Collections.sort(list, new IdSort());
		for (Students sts : list) {
			System.out.println(sts);
		}
	}

}
