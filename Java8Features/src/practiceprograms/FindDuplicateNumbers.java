package practiceprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,50,70,80,80,2,2);
		Set<Integer> uniqueSet = new HashSet<Integer>();
		//Using Java 7
		System.out.println("Using Java 7 : ");
		for (Integer number : numbers) {
			if(!uniqueSet.add(number))
				System.out.println(number);
		}
		
		//Using Java 8
		uniqueSet.clear();
		System.out.println("\nUsing Java 8 : ");
		numbers.stream().filter(num -> !uniqueSet.add(num)).forEach(System.out::println);
	}

}
