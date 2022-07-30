class A {
	public void show() {
		System.out.println("in A");
	}
}

class B extends A {

	public void show() {
		super.show();
		System.out.println("in B");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1 = new B();
		obj1.show();
	}

}
