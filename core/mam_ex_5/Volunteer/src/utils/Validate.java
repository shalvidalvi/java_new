package utils;

import java.time.LocalDate;
import java.util.ArrayList;

import com.app.Volunteer;
import utils.*;
public class Validate {

	public static Volunteer checkEqual(Volunteer v,ArrayList<Volunteer> vol) throws CustomException
	{
		for(Volunteer vo:  vol)
		{
			if(vo.equals(v))
			{
				throw new CustomException("Cant Add with same name  and  Dob..");
			}
		}
		return v;
	}
	
	public static LocalDate validateDate(String date) throws CustomException
	{
		if(LocalDate.parse(date).isBefore(LocalDate.parse("1980-01-01")))
		{
			throw new CustomException("Date Constraints mismatch cant be before 1980-01-01..");
		}
		return LocalDate.parse(date);
	}
}
