class Adder{  
int add(int a, int b){
	return a+b;
	}  
 double add(double a, double b){
	return a+b;
	}  
}  
public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  		Adder ad= new Adder();
		   System.out.println("Sum="+ad.add(8.9, 1));
	}

}
