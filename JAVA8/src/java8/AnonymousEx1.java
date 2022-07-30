package java8;

interface Student {
	String x = "Abhisek Sharma";
	int y = 2341;
	int z = 23;

	void Name();

	void Id();

	void Age();

}

public class AnonymousEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student() {

			@Override
			public void Name() {
				// TODO Auto-generated method stub
				System.out.println("Name of the student is : " + x);
			}

			@Override
			public void Id() {
				// TODO Auto-generated method stub
				System.out.println("I'd Number Of the student is : " + y);
			}

			@Override
			public void Age() {
				// TODO Auto-generated method stub
				System.out.println("Age of the Student is : " + z);
			}

		};
		s.Name();
		s.Id();
		s.Age();

	}

}
