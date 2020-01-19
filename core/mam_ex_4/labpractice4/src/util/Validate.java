package util;

import java.time.LocalDate;
import java.util.List;

import com.app.Student;

import Except.StudentException;

public class Validate {

	public static Student checkStudent(Student s,List<Student> l1) throws StudentException
	{
		for(Student a:l1)
		{
			if(a.equals(s))
			{
				throw new StudentException("Student already present");
			}
		}
		return s;
	}
	
	
	public static LocalDate validateDate(String date) throws StudentException
	{
		if(LocalDate.parse(date).isBefore(LocalDate.parse("1995-11-27")))
		{
			throw new StudentException("invalid date.......");
		}
		return LocalDate.parse(date);
	}
}
