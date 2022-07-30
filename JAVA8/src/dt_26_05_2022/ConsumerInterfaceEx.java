package dt_26_05_2022;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Stringlist = Arrays.asList("Binit", "Suman", "Atharva", "Anuj");
		Consumer<String> list1 = t -> System.out.print(t + " - ");
		Consumer<String> list2 = t -> System.out.print(t.charAt(0) + " - ");
		System.out.println("ArrayList Elements : ");
		Stringlist.forEach(list1);
		System.out.println();
		System.out.println("First letter of ArrayList Elements : ");
		Stringlist.forEach(list2);

	}

}
