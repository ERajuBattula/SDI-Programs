package exception;

import java.util.*;


public class UnsupportedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String array[] = {"a", "b", "c"};
	        List<String> list = Arrays.asList(array);
	        list.add("d");
	}
}
