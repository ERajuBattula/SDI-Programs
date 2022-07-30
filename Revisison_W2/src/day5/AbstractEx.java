package day5;

abstract class Shape {
	abstract void Draw();
}
class Circle extends Shape {
	@Override
	void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle...");
	}
}
class Triangle extends Shape {
	@Override
	void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Triangle...");
	}
}
public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape ob = new Circle();
		ob.Draw();
	}
}
