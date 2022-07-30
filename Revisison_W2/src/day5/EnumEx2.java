package day5;

enum Resturant {
	KFC, McDonalds, Dominos, PizzaHut, GreenChilies, BurgerKing, StarBucks, CafeCoffee
}

public class EnumEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resturant r;
		r = Resturant.PizzaHut;
		switch (r) {
		case KFC:
			System.out.println("I am at " + r.KFC);
			break;
		case McDonalds:
			System.out.println("I am at " + r.McDonalds);
			break;
		case Dominos:
			System.out.println("I am at " + r.Dominos);
			break;
		case PizzaHut:
			System.out.println("I am at " + r.PizzaHut);
			break;
		case GreenChilies:
			System.out.println("I am at " + r.GreenChilies);
			break;
		case BurgerKing:
			System.out.println("I am at " + r.BurgerKing);
			break;
		case StarBucks:
			System.out.println("I am at " + r.StarBucks);
			break;
		case CafeCoffee:
			System.out.println("I am at " + r.CafeCoffee);
			break;
		}
	}

}
