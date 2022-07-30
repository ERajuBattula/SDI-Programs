package dt_26_05_2022;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainingConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Stringlist = Arrays.asList("Binit", "Suman", "Atharva", "Anuj");
		Consumer<String> list1 = t -> System.out.println("Element : "+t );
		Consumer<String> list2 = t -> System.out.println("First Char : "+t.charAt(0));
		Stringlist.forEach((list1).andThen(list2));
		
	}

}
