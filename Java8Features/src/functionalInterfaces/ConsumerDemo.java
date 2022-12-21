package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	/* using traditional approach
	 * @Override public void accept(Integer t) {
	 * System.out.println("Print value : "+t); }
	 */
	//( t)-> System.out.println("Print value : " + t);
	
	public static void main(String[] args) {
		//using reg expression
		Consumer<Integer> consumer = t-> System.out.println("Print value : " + t);
		
		//consumer.accept(20);
		
		//using stream
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8);
		list.stream().forEach(t-> System.out.println("Print value : " + t));
	
	}

}
