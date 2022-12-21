package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Spiderman");
		list.add("Hulk");
		list.add("Superman");
		list.add("Chota Bheem");
		
		//traditional
		for(String s : list)
			System.out.println(s);
		
		//using stream
		list.stream().forEach( t -> System.out.println(t));
		
		Map<Integer, String> map = new HashMap();
		map.put(1,"abc" );
		map.put(2,"pqr" );
		map.put(3,"stu" );
		map.put(4,"xyz" );
		
		map.forEach((key,value)-> System.out.println(key +" : "+value)); 
		
		map.entrySet().stream().forEach(obj -> System.out.println(obj));
		
	}

}
