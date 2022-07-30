package exception;

public class NoSuchMethodErrorExample {
	 public void print(String myString) {
         System.out.println(myString);
     }   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  NoSuchMethodErrorExample nsmee = new NoSuchMethodErrorExample();
          nsmee.print("Hello World");
	}
}
