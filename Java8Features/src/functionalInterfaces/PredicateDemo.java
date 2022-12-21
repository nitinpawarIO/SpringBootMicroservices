package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//public class PredicateDemo implements Predicate<Integer> {
public class PredicateDemo {

	/*
	 * @Override public boolean test(Integer t) { if (t % 2 == 0) return true; else
	 * return false;
	 * 
	 * }
	 */
	
	

	public static void main(String[] args) {
		//Predicate<Integer> predic = new PredicateDemo();
		//System.out.println(predic.test(10));
		
		/*
		 * Predicate<Integer> predicate = (t)-> { if (t % 2 == 0) return true; else
		 * return false;
		 * 
		 * };
		 */
		//with regular expression for test method
		Predicate<Integer> predicate = t -> t % 2 == 0 ;
		
		System.out.println(predicate.test(10));
		
		// using predicate with stream and filter
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8);
		list.stream().filter(predicate).forEach(t -> System.out.println("Even Number : "+t+"\n"));
		
		// adding predicate as a Reg expression to above statement
		list.stream().filter(t -> t % 2 == 0 ).forEach(t -> System.out.println("Even Number : "+t));
	}
}
