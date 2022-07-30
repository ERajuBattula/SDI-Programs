package Abstract;

abstract class Bank {
	abstract int maxLoanAmount();

	abstract int getRateOfInterest();
}

class SBI extends Bank {

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	int maxLoanAmount() {
		// TODO Auto-generated method stub
		return 3_00_000;
	}

}

class UBI extends Bank {

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	int maxLoanAmount() {
		// TODO Auto-generated method stub
		return 5_00_000;
	}

}

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		System.out.println("Maximum Amount you can loan: " + s.maxLoanAmount() + " Rupees");
		System.out.println("Rate of Interest is: " + s.getRateOfInterest() + " %");
		System.out.println();
		UBI u = new UBI();
		System.out.println("Maximum Amount you can loan: " + u.maxLoanAmount() + " Rupees");
		System.out.println("Rate of Interest is: " + u.getRateOfInterest() + " %");
	}

}
