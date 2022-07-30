package java8;

abstract class dog {
	abstract void eat();

	abstract void sound();

}

public class AnonymousEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog() {

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("Dog loves to eat : Bones");
			}

			@Override
			void sound() {
				// TODO Auto-generated method stub
				System.out.println("Dogs Bark.");
			}

		};
		d.eat();
		d.sound();

	}

}
