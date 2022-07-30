package day5;

enum Animals {
	Tiger, Lion, Deer, Kangaroo, Stag, Monkey, Hippo
}

public class EnumEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a = Animals.Tiger;
		if (a == Animals.Deer || a == Animals.Kangaroo || a == Animals.Stag) {
			System.out.println(a + " This animal is a vegan.");
		} else
			System.out.println(a + ": This animal is not a vegan.");
		Animals[] anm = Animals.values();
		System.out.println("List Of Animals : ");
		for (Animals b : anm) {
			System.out.print(b + ", ");
		}
	}
}
