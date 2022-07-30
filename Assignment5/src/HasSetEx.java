import java.util.*;

public class HasSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hSet = new HashSet<>();
		hSet.add("Anant");
		hSet.add("Bhumi");
		hSet.add("Dinesh");
		hSet.add("Gemini");
		hSet.add("Kumar");

		System.out.println(hSet);

		System.out.println("Size of HashSet : " + hSet.size());

		hSet.remove("Kumar");
		System.out.println(hSet);
	}

}