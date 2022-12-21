package features.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//public class SupplierDemo  implements Supplier<String>{
public class SupplierDemo {

	/*
	 * @Override public String get() {
	 * 
	 * return "My Supplier Test !"; } traditional approach
	 */
	
	public static void main(String[] args) {
		//Supplier supplier = new SupplierDemo();
		Supplier<String> supplier =  () -> "My Supplier Test !";
		System.out.println(supplier.get());
		
		List<String> list = Arrays.asList();
		//System.out.println(list.stream().findAny().orElseGet(supplier));
		System.out.println(list.stream().findAny().orElseGet(() -> "Hi Team !"));
				
	}
	

}
