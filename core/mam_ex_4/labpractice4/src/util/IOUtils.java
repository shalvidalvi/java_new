package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.app.Course;

public class IOUtils {
	public static void addToFile(HashMap<String, Course> hm)
	{
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("xyz.ser"));
			
			out.writeObject(hm);

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static HashMap<String, Course> restore() throws ClassNotFoundException
	{
		File f1=new File("xyz.ser");
		if(f1.exists() && f1.isFile() && f1.canRead())
		{
			try {
				ObjectInputStream in=new ObjectInputStream(new FileInputStream(f1));
				return (HashMap<String, Course>) in.readObject();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
		return new HashMap<String, Course>();
	}
	
	

}
