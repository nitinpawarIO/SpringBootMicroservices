package practiceprograms;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streams.Employee;

public class FindHighestPaidEmployeeInDepartment {

	public static void main(String[] args) {
		
		List<Employee> employees = Stream.of(new Employee(1, "Nitin", "DEV", 10000),
											new Employee(2, "Saurabh", "DEV", 15000),
											new Employee(4, "Atul", "QA", 20000),
											new Employee(3, "Sraddha", "BA", 5000),
											new Employee(5, "Sagar", "BA", 8000),
											new Employee(5, "aaaa", "BA", 20000))
											.collect(Collectors.toList());
		
		Comparator<Employee> salaryComparator = Comparator.comparingDouble(Employee::getSalary);
		
		Map<String, Optional<Employee>> result = employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(salaryComparator))));
		System.out.println("result : "+result);
		
		Map<String, Optional<Employee>> result1 = employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
		
		System.out.println("result1 : "+result1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Map<String, Optional<Employee>> practiceResult = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		
		
		System.out.println(practiceResult);
	}

}
