import java.util.*;

class Product implements Comparable<Product> {
	private String name;
	private int price;
	private char performance;

	Product(String name, int price, char performance) {
		this.name = name;
		this.price = price;
		this.performance = performance;
	}

	@Override
	public String toString() {
		return "Product [Brand=" + name + ", price=" + price + ", performance=" + performance + "]";
	}

	@Override
	public int compareTo(Product s) {
		if (this.performance > s.performance) {
			return 1;
		} else if (this.performance < s.performance) {
			return -1;
		}
		return 0;
	}
}

public class Comparables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		list.add(new Product("Kia", 3400000, 'A'));
		list.add(new Product("Jaguar", 4600000, 'B'));
		list.add(new Product("Maruti 800", 200000, 'D'));
		list.add(new Product("Tata Nano", 250000, 'C'));
		list.add(new Product("Tesla", 7000000, 'A'));
		list.add(new Product("Porshe", 30800000, 'A'));

		for (Product s : list) {
			System.out.println(s);
		}
		System.out.println(
				"_._._._._._._._._._._._._._._._._._._._._._._._._._._._");
		Collections.sort(list);

		for (Product s : list) {
			System.out.println(s);
		}
	}
}
