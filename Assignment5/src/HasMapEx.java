import java.util.*;

public class HasMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();

//inserting Elements
		map.put("Amar", 234);
		map.put("Samar", 134);
		map.put("Rama", 453);
		map.put("Shyam", 653);
		map.put("Guna", 908);
		System.out.println(map);

//Removing Element
		map.remove("Guna", 908);
		System.out.println(map);

//To get all key names
		System.out.println(map.keySet());

//to get all values
		System.out.println(map.values());

		System.out.println(map.containsKey("Amar"));
		System.out.println(map.containsValue(453));

//Size of the map
		System.out.println("Size of the map : " + map.size());

	}

}