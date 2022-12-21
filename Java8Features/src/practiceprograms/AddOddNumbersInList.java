package practiceprograms;

import java.util.Arrays;
import java.util.List;

public class AddOddNumbersInList {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Integer sum = numbers.stream().filter(n -> (n%2 != 0)).reduce(0, Integer::sum);
		System.out.println(sum);
	}

}
