package features.streams;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	
	public static List<Employee> getEmployees(){
		
		List<Employee> empList= new ArrayList();
		empList.add(new Employee(1,"Nitin","CloudDev",800000));
		empList.add(new Employee(2,"Chirag","IT",900000));
		empList.add(new Employee(3,"Atul","CloudDev",600000));
		empList.add(new Employee(4,"Saurabh","IT",500000));
		
		
		return empList;
	}

}
