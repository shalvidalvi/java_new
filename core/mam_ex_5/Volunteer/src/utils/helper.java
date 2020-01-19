package utils;

import java.util.ArrayList;
//import java.utils.*;
import com.app.Volunteer;

public class helper 
{
 
	public static  Volunteer getVolunteer(String name,ArrayList<Volunteer> vol) throws utils.CustomException
	{
		int i = vol.indexOf(new Volunteer(name));
		if(i!=1)
		{
			throw  new CustomException("Entry not available by the name "+name);
		}
		return vol.get(i);
		
		
	}
}
