package practiceprograms;

import java.util.HashMap;
import java.util.Map;

public class Temp {
	
	public static void main(String[] args) {
		Map<Integer,String> test = new HashMap();
		test.put(1, "Anvika");
		test.put(2, "Nitin");
		
		System.out.println("Hashmap : "+test);
		
		test.remove(4);
		//test.remove(5, "Anvi");
		System.out.println("Hashmap : "+test);
		
	}

}
