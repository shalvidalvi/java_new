package tester;

import java.util.List;
import java.util.Scanner;


import dao.StudentsDaoImpl;
import pojos.Students;

public class test1 {
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		
		{
			StudentsDaoImpl dao=new StudentsDaoImpl();
			boolean b=false;
			while(!b)
			{
				System.out.println("enter 1 to check details of students course wise\n 2update marks of a student \n 3. to delete student \n 8 to exit");
				switch(sc.nextInt())
				{
				case 1:
					System.out.println("enter course name dac/dbda");
					List<Students> l1=dao.getStudentDetails(sc.next());
					for(Students a: l1)
					{
						System.out.println(a);
					}
					
					break;
				case 2:
					System.out.println("enter id and marks");
					System.out.println(dao.updateMarks(sc.nextInt(), sc.nextInt()));
					
				case 3:
					System.out.println("enter id to delete student");
					System.out.println(dao.removeStudent(sc.nextInt()));
				case 8:
					b=true;
					
				}
			}
			
			
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
