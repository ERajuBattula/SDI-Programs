package AccessModifiers;
class TestClass{	

	private int result = 0;	
	
	
	public int addNumber(int a, int b){
		int localResult = a + b;
		this.result = localResult;
		System.out.println("Result is : "+ this.result);
		return localResult;
	}
}

public class PrivateMemebers{
	private int counter = 0;
	
	private void incrementNumber(int incrementValue){		
		counter += incrementValue; 
		System.out.println("Incremented counter value is: "+ this.counter);
	}
		
	public static void main(String args[]){		
		
		PrivateMemebers object = new PrivateMemebers();
		
		object.incrementNumber(5);
		object.incrementNumber(6);
		object.incrementNumber(3);
		TestClass testClass = new TestClass();
		testClass.addNumber(10, 20); 
	}
}


