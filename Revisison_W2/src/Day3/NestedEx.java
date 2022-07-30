package Day3;
class Outer {
	int x = 9;
	private int y = 2;
	static int z = 10;
	class Inner {
		void show() {
			System.out.println("Value of X : " + x);
			System.out.println("Value of Y : " + y);
			System.out.println("Value of Z : " + z);
		}
	}
}
public class NestedEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		Outer.Inner obj2 = obj.new Inner();
		obj2.show();
	}
}
