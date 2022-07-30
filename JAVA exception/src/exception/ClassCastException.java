package exception;

class Parents {
	public void showcase() {
		System.out.println("I am Parent");
	}
}

class Children extends Parents {
	public void showcase() {
		System.out.println("I am Children");
	}
}

public class ClassCastException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Children obj = (Children) new Parents();

			obj.showcase();
		} catch (Exception e) {
			System.out.println("Exception found : " + e.getMessage());
		}
	}
}
