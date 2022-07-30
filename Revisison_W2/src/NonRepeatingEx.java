public class NonRepeatingEx {
	static boolean flag;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbccdd";
		
		for (int i = 0; i < s.length(); i++) {
			flag=false;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(s.charAt(i));
				break;
			}
		}//Outer Loop End
		if(flag==true) System.out.println("No NonRepeating Character");
	}
}
