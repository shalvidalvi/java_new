package utils;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.app.Volunteer;

public class IOUtil 
{
	

public static void addtofile(ArrayList<Volunteer> vol)
{
	try(ObjectOutputStream out =new ObjectOutputStream( new FileOutputStream("vol.ser")))
	{
		out.writeObject(vol);
	}
	catch(IOException c)
	{
		c.printStackTrace();
	}
}

public static ArrayList<Volunteer> restore()
{
	ArrayList<Volunteer> vol =new ArrayList<>();
	File f1 = new File("vol.ser");
	if(f1.exists()&&f1.isFile() && f1.canRead())
	
	try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("vol.ser")))
	{
	             try {
					 return  (ArrayList<Volunteer>) in.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	             
	           } catch (FileNotFoundException e) {
		// TODO Auto-generated catch blocki
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return new ArrayList<>();
}
}
