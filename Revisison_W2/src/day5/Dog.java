package day5;

abstract class Animal {
	abstract void eat();
}

public class Dog extends Animal {

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eat bones..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Dog();
		obj.eat();
	}

}
