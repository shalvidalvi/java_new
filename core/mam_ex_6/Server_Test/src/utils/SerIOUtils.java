package utils;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.app.core.MobileClient;

public class SerIOUtils {
	//write static method to send emp data to clnt
	public static void writeData(ObjectOutputStream out,MobileClient e) throws IOException
	{
		out.writeObject(e);
	}
}
