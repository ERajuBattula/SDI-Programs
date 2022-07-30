import java.util.*;

class Products {
	private String Brand;
	private int price;
	private String type;

	Products(String Brand, int price, String Type) {
		this.Brand = Brand;
		this.price = price;
		this.type = Type;
	}

	public String getBrand() {
		return Brand;
	}

	public int getPrice() {
		return price;
	}

	public String getGrade() {
		return type;
	}

	@Override
	public String toString() {
		return "Product [name=" + Brand + ", price=" + price + ", Type=" + type + "]";
	}

}

class compDemo implements Comparator<Products> {

	@Override
	public int compare(Products p1, Products p2) {
		if (p1.getPrice() > p2.getPrice()) {
			return 1;
		} else if (p1.getPrice() < p2.getPrice()) {
			return -1;
		}
		return 0;
	}

}

public class Comparators {
	public static void main(String[] arr) {
		List<Products> list = new ArrayList<>();
		list.add(new Products("Parle-G", 20, "Veg"));
		list.add(new Products("Good Day", 10, "Veg"));
		list.add(new Products("Tiger", 30, "Veg"));
		list.add(new Products("Britania", 50, "Veg"));
		list.add(new Products("Toast", 30, "Veg"));
		list.add(new Products("MilkyPi", 40, "Veg"));

		for (Products p : list) {
			System.out.println(p);
		}
		System.out.println("-------------------------------------------------");
		Collections.sort(list, new compDemo());

		for (Products p : list) {
			System.out.println(p);
		}

	}

}
