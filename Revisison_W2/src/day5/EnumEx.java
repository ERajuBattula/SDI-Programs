package day5;

enum Dish {
	ChickenTandoori, Chowmin, EggRole, ChilliChicken, ButterNaan, MattarPaneer
}

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dish d,i;
		d = Dish.MattarPaneer;
		i=Dish.ButterNaan;
		System.out.println("Today I Want To Eat " + d +" & "+i+ ".");
	}
}
