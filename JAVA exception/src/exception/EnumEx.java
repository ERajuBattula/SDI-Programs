package exception;



enum Resturant {
	 McDonalds, Dominos, PizzaHut, GreenChilies, BurgerKing, StarBucks, CafeCoffee
}
public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Resturant.valueOf("a"));
	}
}
