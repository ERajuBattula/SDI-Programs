package java8;

interface MessageEx {
	void getMessage();
}

class Message {
	Message() {
		System.out.print("Hello EveryOne.");
	}
}

public class ConstructorMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageEx msg = Message::new;
		msg.getMessage();
	}

}
