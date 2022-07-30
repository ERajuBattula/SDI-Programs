package exception;

public class ClassNotFoundException {

	//@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c = Class.forName("exception.go");
			System.out.println("Class found : " + c.toString());
		}
		catch (Exception e) {

			System.out.println("exception occured : " + e.getMessage());
		}
	}
}
