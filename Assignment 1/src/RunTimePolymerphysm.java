class Parents {
public void showcase () {
System.out.println("I am Parent");
}
}
class Children extends Parents {
	public void showcase () {
		System.out.println("I am Children");
		}
}
public class RunTimePolymerphysm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parents obj = new Children(); 
		obj.showcase();
	}

}
