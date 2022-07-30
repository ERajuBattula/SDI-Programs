package java8;

interface MessageEx2 {
	void getMessage();
}

class Message2 implements MessageEx2 {

	@Override
	public void getMessage() {
		// TODO Auto-generated method stub
		System.out.print("Hello to those who are present here...");
	}

}

public class InstanceMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message2 m = new Message2();
		MessageEx2 mseg = m::getMessage;
		mseg.getMessage();
	}

}
