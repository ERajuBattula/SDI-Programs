import java.util.*;
public class AreaAndVolume {
	private static Scanner scan;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double Radius, Area, Volume, Height;
			scan = new Scanner(System.in);
			
			System.out.println("\n Please Enter the radius of a Cylinder : ");
			Radius = scan.nextDouble();
			System.out.println("\n Please Enter the Height of a Cylinder : ");
			Height = scan.nextDouble();
			
			Area = 2 * 3.141 * Radius * (Radius + Height);
			Volume = 3.141 * Radius * Radius * Height;
			
			
			System.out.format("\n The area of a Cylinder = %f ", Area);
			System.out.format("\n The Volume of a Cylinder = %f", Volume);
			
	}

}
