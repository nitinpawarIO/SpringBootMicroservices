package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeIncrementDemo {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee(1, "amol", "IT", 12000);
		Employee e2 = new Employee(2, "sam", "Sales", 20000);
		Employee e3 = new Employee(3, "Joe", "IT", 15000);
		Employee e4 = new Employee(4, "kiran", "Sales", 25000);
		Employee e5 = new Employee(5, "pravin", "Sales", 5000);
		
		employees .add(e1);
		employees .add(e2);
		employees .add(e3);
		employees .add(e4);
		employees .add(e5);
		
		List<Employee> revisedSal = employees.stream().map(e -> {
			if(e.getDept().equalsIgnoreCase("Sales"))
			{
				e.setSalary((long) (e.getSalary()*1.20));
			}
			return e;
		}).collect(Collectors.toList());
		
		System.out.println("Revised Salary : "+ revisedSal);
		
	}

}
