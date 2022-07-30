package Abstract;

abstract class Cricket {
	abstract void playerName();

	abstract int jersyNumber();

	abstract int totalInternationalRuns();

	abstract int numberOfCenturies();
}

class Kohli extends Cricket {

	@Override
	void playerName() {
		// TODO Auto-generated method stub
		System.out.println("Virat Kohli");
	}

	@Override
	int jersyNumber() {
		// TODO Auto-generated method stub
		return 18;
	}

	@Override
	int totalInternationalRuns() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	int numberOfCenturies() {
		// TODO Auto-generated method stub
		return 70;
	}

}

class Sachin extends Cricket {

	@Override
	void playerName() {
		// TODO Auto-generated method stub
		System.out.println("Sachin Tendulkar");
	}

	@Override
	int jersyNumber() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	int totalInternationalRuns() {
		// TODO Auto-generated method stub
		return 25000;
	}

	@Override
	int numberOfCenturies() {
		// TODO Auto-generated method stub
		return 100;
	}

}

class Rohit extends Cricket {

	@Override
	void playerName() {
		// TODO Auto-generated method stub
		System.out.println("Rohit Sharma");
	}

	@Override
	int jersyNumber() {
		// TODO Auto-generated method stub
		return 45;
	}

	@Override
	int totalInternationalRuns() {
		// TODO Auto-generated method stub
		return 10000;
	}

	@Override
	int numberOfCenturies() {
		// TODO Auto-generated method stub
		return 41;
	}

}

public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kohli k = new Kohli();
		k.playerName();
		System.out.println("Player jersy number :" + k.jersyNumber());
		System.out.println("Total InterNational Runs :" + k.totalInternationalRuns() + "+ Runs");
		System.out.println("Total Number Of InterNational CEnturies :" + k.numberOfCenturies() + " Centuries");
		System.out.println();
		Sachin s = new Sachin();
		s.playerName();
		System.out.println("Player jersy number :" + s.jersyNumber());
		System.out.println("Total InterNational Runs :" + s.totalInternationalRuns() + "+ Runs");
		System.out.println("Total Number Of InterNational CEnturies :" + s.numberOfCenturies() + " Centuries");
		System.out.println();
		Rohit r = new Rohit();
		r.playerName();
		System.out.println("Player jersy number :" + r.jersyNumber());
		System.out.println("Total InterNational Runs :" + r.totalInternationalRuns() + "+ Runs");
		System.out.println("Total Number Of InterNational CEnturies :" + r.numberOfCenturies() + " Centuries");

	}

}
