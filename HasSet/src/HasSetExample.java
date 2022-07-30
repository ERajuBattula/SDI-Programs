import java.util.*;
public class HasSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> set=new HashSet<String>();  
         set.add("More");    
         set.add("Shore");    
         set.add("Care");   
         set.add("Share");  
         set.add("Throne");  
         System.out.println(set);
         set.remove("Throne");
         System.out.println(set);
         System.out.println(set.isEmpty());
         System.out.println(set.contains("Share"));
         System.out.println(set.size());
	}

}
