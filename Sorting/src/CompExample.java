import java.util.*;

class Student {
	private String Name;
	private int Id;
	private String Email;
	private String City;

	Student(String Name, int Id, String Email, String City) {
		this.Name = Name;
		this.Id = Id;
		this.Email = Email;
		this.City = City;

	}

	public String getName() {
		return Name;
	}

	public int getId() {
		return Id;
	}

	public String Email() {
		return Email;
	}

	public String City() {
		return City;
	}

	public String toString() {
		return "Student Details[ name : " + Name + ", Id : " + Id + ", Gmail : " + Email + ", City : " + City + "]";

	}
}

class compDem implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}

public class CompExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ranjan Sahoo", 1343, "ranju@gmail.com", "Chennai"));
		list.add(new Student("Abhinash Mallik", 3675, "Abhi32@gmail.com", "Kolakata"));
		list.add(new Student("Rina Jena", 4532, "rinaj09@gmail.com", "Bhubaneswar"));
		list.add(new Student("k Rudraksh Saha", 2341, "rudra67@gmail.com", "Bhopal"));
		list.add(new Student("Ranjan ku Mohanta", 7512, "ranjankm567@gmail.com", "Pune"));

		for (Student s : list) {
			System.out.println(s);
		}
		System.out.println("----------------------------------------------------");

		Collections.sort(list, new compDem());
		for (Student s : list) {
			System.out.println(s);
		}
	}

}
