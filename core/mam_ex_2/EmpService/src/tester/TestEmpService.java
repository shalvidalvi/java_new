package tester;
import static java.lang.System.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.app.*;
import static utils.CollectionEmp.*;
import static utils.helper.*;
import utils.CustomException;
public class TestEmpService {

	public static void main(String[] args) {
		ArrayList<Employee> emp =populate();
		LocalDate d;
	try(Scanner sc =new Scanner(in))
	{
		int i=1;
		while(i==1)
		{   
			out.println("Choose from following..");
			out.println("1:Add employee  \n 2:view By ID \n 3: view by Date \n  4: delete\n   5:exit");
			switch(sc.nextInt())
			{
			case 1:
			{
				out.println("enter the details as.. id,name,dob,hiredate,salary,department");
				Employee e=new Employee(sc.nextInt(),sc.next(),LocalDate.parse(sc.next()),LocalDate.parse(sc.next()),sc.nextDouble(),sc.next());
				out.println(e);
				for(Employee e1 : emp)
				{
					out.println("inside");
				   if(	e1.equals(e))
				   {
					   throw new CustomException("Can't Add...");
				   }
				}
				emp.add(e);
			}
				break;
				
			case 2:
				out.println("enter employee id..");
				Employee e2 =getEmployee(sc.nextInt(),emp);
				if(e2 == null)
				{
					throw new CustomException(" Invalid Id..");
				}
				out.println(e2);
				break;
				
			case 3:
				out.println("Enter hireDate..");
				ArrayList<Employee> e3 = getEmployeeList(LocalDate.parse(sc.next()),emp);
				if(e3==null)
				{
					throw new CustomException(" Invalid date..");
				}
				for(Employee e4 :emp)
				{
					out.println(e4);
				}
				break;
				
			case 4:
				out.println("enter employee id..");
				Employee e5 =getEmployee(sc.nextInt(),emp);
				if(e5 == null)
				{
					throw new CustomException(" Invalid Id..");
				}
				emp.remove(e5);
				out.println("removed Successfully..");
				break;
				
			case 5:
				i=0;
			}
		}
	}
	catch(Exception e)
	{
		out.println("e");
	}
	}

}
