package streams;

import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10,2,4,3,23,25,7,6,8,3,1);
		//filter > 5 and sort remaining
		numbers.stream().filter(n -> n > 5).sorted().forEach( t -> System.out.println(t));
	}

}
