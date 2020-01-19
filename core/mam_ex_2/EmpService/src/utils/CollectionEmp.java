package utils;

import java.time.LocalDate;
import java.util.ArrayList;

import com.app.Employee;

public class CollectionEmp {
 
	public static ArrayList<Employee> populate()
	{
		ArrayList<Employee> e1=new ArrayList<>();
		Employee e = new Employee(1,"Pranav",LocalDate.parse("1995-10-14"),LocalDate.parse("2019-11-20"),2000,"Research");
		e1.add(e);
		
		Employee e2 = new Employee(2,"Abhinav",LocalDate.parse("1995-11-11"),LocalDate.parse("2019-11-20"),2000,"Research");
		e1.add(e);
		
		Employee e3 = new Employee(3,"Shubham",LocalDate.parse("1995-12-10"),LocalDate.parse("2019-11-20"),2000,"Research");
		e1.add(e);
		
		return e1;
	}
}
