package tester;

import java.time.LocalDate;
import java.util.HashMap;
//import static java.lang.System.*;
import java.util.Scanner;
import static util.IOUtils.*;
import com.app.Course;
import com.app.Student;
import static util.Validate.*;
public class TestStudent {

	public static void main(String[] args) throws ClassNotFoundException {
		HashMap<String,Course> course= restore();
		System.out.println(course);
		
		try (Scanner sc=new Scanner(System.in)){
			boolean b=false;
			while(!b)
			{
				System.out.println("enter 1. add course. \n 2.add student \n3. get Student by course name 5.exit");
				switch(sc.nextInt())
				{
				case 1: System.out.println("enter course details as-  name, id ");
				Course c=new Course(sc.next(),sc.nextInt());
				course.putIfAbsent(c.getName(), c);
				break;
				
				case 2:
					System.out.println("Enter course name");
					Course cou=course.get(sc.next());
					System.out.println("enter student details as- id, name, age,registration date");
					Student s=new Student(sc.nextInt(),sc.next(),sc.nextInt(),validateDate(sc.next()));
					cou.addStudent(checkStudent(s,cou.getSlist()));
					break;
				case 3:
					System.out.println("Enter course name");
					Course cous=course.get(sc.next());
					System.out.println(cous.getSlist());
					break;
				case 5:
					addToFile(course);
					b=true;
					
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
