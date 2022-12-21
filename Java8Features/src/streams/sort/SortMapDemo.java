package streams.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import streams.Employee;

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
		
		for(Entry<String,Integer> entry : list)
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		*/
		
		/* Using Streams API*/
		System.out.println("comparingbyKey : ");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(obj -> System.out.println(obj.getKey() +" "+ obj.getValue()));
		System.out.println("comparingbyValue : ");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		/* Sort Map with employee object traditional approach*/
		
		Map<Employee, Integer> employeeMap = new TreeMap<>((emp1,  emp2) -> (int)(emp2.getSalary() - emp1.getSalary()));			
		
		employeeMap.put(new Employee(200,"AMAR","IT",57000), 1);
		employeeMap.put(new Employee(201,"Yogesh","AI",55000), 2);
		employeeMap.put(new Employee(202,"Samira","Cloud",80000), 3);
		employeeMap.put(new Employee(203,"Pravin","Training",50000), 4);
		employeeMap.put(new Employee(204,"Vijay","HR",40000), 5);
		
		//employeeMap.entrySet().stream().forEach(System.out::println);
		
		/* Sort Map with employee object Stream approach*/
		
		//by key
		//employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId).reversed())).forEach(System.out::println);
		
		//by value
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
