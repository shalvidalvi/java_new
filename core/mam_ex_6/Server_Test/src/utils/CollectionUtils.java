package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import com.app.core.MobileClient;

public class CollectionUtils 
{
	private static SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	public static HashMap<String,MobileClient> getClientList() throws ParseException
	{
		HashMap<String, MobileClient> map=new HashMap<String, MobileClient>();
		MobileClient m1=new MobileClient("8805732366", "Poonam", sdf.parse("12-07-1992"));
		m1.addBill(230);
		m1.addBill(230);
		m1.addBill(230);
		m1.addBill(230);
		m1.addBill(230);
		m1.addBill(230);
		
		map.put(m1.getMobileNo(),m1 );
		MobileClient m2= new MobileClient("8308337272", "Mayur", sdf.parse("27-09-1992"));
		m2.addBill(230);
		m2.addBill(230);
		m2.addBill(230);
		m2.addBill(230);
		m2.addBill(230);
		m2.addBill(230);
		map.put(m2.getMobileNo(),m2 );
		MobileClient m3= new MobileClient("8805475535", "Rushikesh", sdf.parse("07-09-1999"));
		m3.addBill(230);
		m3.addBill(230);
		m3.addBill(230);
		m3.addBill(230);
		m3.addBill(230);
		m3.addBill(230);
		map.put(m3.getMobileNo(),m3);
		
		return map;
	}
	

}
