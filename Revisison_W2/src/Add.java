import java.util.ArrayList;

public class Add {

	public static void main(String[] args) {
		ArrayList<Integer> s=new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s);
		
		s.add (2,10);
		System.out.println(s);

	}

}
