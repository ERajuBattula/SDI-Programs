abstract class Animal{
	abstract void My_Name_Is();
	abstract void makesound();
	abstract void eat();
	//public void eat() {
		//System.out.println("I eat :");
	//}
	
}
class Dog extends Animal {
	@Override
	void My_Name_Is() {
		// TODO Auto-generated method stub
		System.out.println("I am Dog.");
	}
	
	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("I can Bark.");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("I eat bone.");
	}

	
}
class Cat extends Animal{
	@Override
	void My_Name_Is() {
		// TODO Auto-generated method stub
		System.out.println("I am Cat.");
	}
	
	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("I can Meow.");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("I eat Fish.");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d1=new Dog();
Cat c1=new Cat();
d1.My_Name_Is();
d1.makesound();
d1.eat();

System.out.println();

c1.My_Name_Is();
c1.makesound();
c1.eat();
	}

}
