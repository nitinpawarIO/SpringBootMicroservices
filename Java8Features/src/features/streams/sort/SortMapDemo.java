package features.streams.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("eight",8);
		map.put("five",5);
		map.put("ten",10);
		map.put("four",4);
		map.put("two",2);
		
		List<Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
		/*traditional approach 
		Collections.sort(list, new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				//return o1.getKey().compareTo(o2.getKey());
				return o2.getValue()-o1.getValue();//desc
			}
			
		}); */
		
		//using lambda expression
		/*
		Collections.sort(list,(o1,o2) ->  o1.getKey().compareTo(o2.getKey()));
		*/
		
		/* Using Streams API*/
		
		map.entrySet().stream().sorted();
		
		for(Entry<String,Integer> entry : list)
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}

}
