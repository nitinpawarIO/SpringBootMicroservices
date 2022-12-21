package practiceprograms;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharOccurancesInString {

	public static void main(String[] args) {

			String input = "nitin";
			Map<String, Long> collectMap = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			System.out.println(collectMap);
			
			
		
	}

}
