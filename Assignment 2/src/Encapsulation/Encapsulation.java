package Encapsulation;

class Encaps {
	private String name;
	private int age;
	private int RollNum;

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;

	}

	public int getRollNum() {
		return RollNum;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setRollNum(int newRollNum) {
		RollNum = newRollNum;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encaps encap = new Encaps();
		encap.setName("Anuj");
		encap.setAge(20);
		encap.setRollNum(12343);
		System.out.println(
				"Name : " + encap.getName() + "\nAge : " + encap.getAge() + "\nRoll Number : " + encap.getRollNum());
	}

}
