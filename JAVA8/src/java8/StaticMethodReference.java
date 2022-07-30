package java8;

interface MessageEx1 {
	void getMessage();
}

class Message1 {
	public static void show() {
		System.out.print("Hello EveryOne....");
	}
}

public class StaticMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageEx1 msg = Message1::show;
		msg.getMessage();
	}

}
