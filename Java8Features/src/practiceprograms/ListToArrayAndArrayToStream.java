package practiceprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListToArrayAndArrayToStream {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(5);
		list.add(25);
		list.add(75);
		list.add(3);
		list.add(15);
		
		Integer[] array = list.stream().toArray(Integer[]::new);
		for(Integer i : array)
			System.out.println("Array val : "+i);
		
		Stream.of(array).forEach(System.out::println);
	}
	

}
