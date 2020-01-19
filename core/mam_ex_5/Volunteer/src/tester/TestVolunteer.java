package tester;
import static java.lang.System.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


import com.app.Volunteer;

import utils.CustomException;
import static utils.Validate.*;
import static utils.IOUtil.*;
import static utils.helper.*;
public class TestVolunteer {

	public static void main(String[] args) {
		
		ArrayList<Volunteer> vol =restore();
		out.println(vol);
		try(Scanner sc= new Scanner(in))
		{
			int i=1;
			while(i==1)
			{
				out.println("Choose from following..");
				out.println("1:Add Volunteer  \n 2:view By ID \n 3: view All \n  4: delete\n   5:exit");
				switch(sc.nextInt())
				{
				case 1:
				{
					out.println("enter the details as.. name,is_Available,Dob");
					Volunteer v=new Volunteer(sc.next(),sc.nextBoolean(),validateDate(sc.next()));
					checkEqual(v, vol);
					String ch ="yes";
					while(ch.equalsIgnoreCase("yes"))
					{
						out.println("Add Hobby..");
						v.addHobby(sc.next());
						out.println("Want to add more..(yes/no)");
						ch=sc.next();
					}
					
					vol.add(v);
				}
					break;
					
				case 2:
					out.println("Enter name to get volunteer details..");
					Volunteer v=getVolunteer(sc.next(), vol);
					out.println(v);
					break;
					
				case 3:
					for(Volunteer v1: vol)
					{
						out.println(v1);
					}
					break;
					
				case 5:
					addtofile(vol);
					i=0;
					
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
