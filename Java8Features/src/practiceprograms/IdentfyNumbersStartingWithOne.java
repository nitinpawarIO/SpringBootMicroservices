package practiceprograms;

import java.util.Arrays;
import java.util.List;

public class IdentfyNumbersStartingWithOne {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 1, 18, 55, 60, 100);

		numbers.stream().map(s -> s+"").filter(s -> s.startsWith("1")).forEach(System.out::println);
		
		//numbers.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
	}

}
