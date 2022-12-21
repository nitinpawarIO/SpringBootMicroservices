package streams;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	public static List<Employee> evaluateTaxUsers(String input)
	{
		return (input.equalsIgnoreCase("tax")) ? EmpDao.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList()):
			EmpDao.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());
			
		
	}

	public static void main(String[] args) {
		System.out.println(evaluateTaxUsers("non-tax"));
	}
}
