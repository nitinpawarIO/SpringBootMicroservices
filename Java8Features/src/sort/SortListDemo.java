package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import streams.EmpDao;
import streams.Employee;

public class SortListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(2);
		
		List<Employee> emplist = EmpDao.getEmployees();
		
	// Ascending order using traditional method
		//Collections.sort(list);
		//Collections.reverse(list); // to get descending order
		//System.out.println(list);
		
	/* sort primitive using stream api 		
		list.stream().sorted().forEach(e -> System.out.println(e));//ascending order
		list.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));//descending order
		*/
		
	/* Sort custom objects using traditional approach 
		Collections.sort(emplist, new MyComparator());
		System.out.println(emplist);
		*/
		
	//Using anonymous class
		/*Collections.sort(emplist, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o2.getSalary() - o1.getSalary());
			}
			
		});
		
		System.out.println(emplist); */
		
	/* Using Lambda expression for functional interface comparator
		//Collections.sort(emplist, (o1,o2) -> (int) (o2.getSalary()- o1.getSalary()));
		
		//System.out.println(emplist);*/
		
	//Using Stream API
		//emplist.stream().sorted((o1,o2)-> (int) (o1.getSalary()- o2.getSalary())).forEach(e -> System.out.println(e));
		
	//further optimized code
		//emplist.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
		emplist.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	}
	
	
}

/* Sort custom objects using traditional approach 
class MyComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o2.getSalary() - o1.getSalary());
	}
	
} */
