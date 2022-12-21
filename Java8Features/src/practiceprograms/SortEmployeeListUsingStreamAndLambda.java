package practiceprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import streams.Employee;

public class SortEmployeeListUsingStreamAndLambda {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", "IT", 11000);
		Employee e2 = new Employee(2, "pqr", "sales", 8000);
		Employee e3 = new Employee(3, "xyz", "sales", 20000);
		Employee e4 = new Employee(4, "cde", "IT", 25000);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		// 1.Create a stream , 2.add sorting condition , 3.collect results in list
		// Using inner class option
		List<Employee> sortedEmployee = employees.stream().sorted(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		}).collect(Collectors.toList());

		//System.out.println(sortedEmployee);

		// Using lambda expression
		employees.stream().sorted((ee1, ee2) -> (int) (ee2.getSalary() - ee1.getSalary())).collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
