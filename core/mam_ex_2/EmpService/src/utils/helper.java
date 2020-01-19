package utils;
import java.time.LocalDate;
import java.util.ArrayList;

import com.app.*;
public class helper
{
public static  Employee getEmployee(int id,ArrayList<Employee> emp)
{
	int i =emp.indexOf(new Employee(id));
	 Employee e=emp.get(i);
	 return e;
}

public static ArrayList<Employee> getEmployeeList(LocalDate d1,ArrayList<Employee> emp)
{
	ArrayList<Employee> e = new ArrayList<>() ;
	Employee e1=new Employee(d1);
	while(emp.contains(e1))
	{
		e.add(e1);
	}
	return e;
}
}
