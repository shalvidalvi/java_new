package tester;

import java.io.DataInputStream;
import static utils.SerIOUtils.*;
import java.io.DataOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.MobileClient;
import static utils.CollectionUtils.*;
public class TestServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			HashMap<String, MobileClient> hmap=getClientList();
			
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			try(ServerSocket ss=new ServerSocket(5000,10);
					Socket ds=ss.accept();)
			{
			
				
				System.out.println(ds);
				
				try(DataOutputStream out=new DataOutputStream(ds.getOutputStream());
						ObjectOutputStream out1=new ObjectOutputStream(ds.getOutputStream())
						)
				{
					out.flush();
					DataInputStream in=new DataInputStream(ds.getInputStream());
						//System.out.println(in.readUTF());
					while(true)
					{
						
						switch (in.readInt()) {
						case 1:
						{
							MobileClient m=hmap.get(in.readUTF());
							out.writeDouble(m.getBills().get(0));
						}
							
							break;
						case 2:
						{
							MobileClient m=hmap.get(in.readUTF());
							System.out.println(m);
							writeData(out1,m);
							
						}
							
							break;
						case 3:
						{
							String name=in.readUTF();
							String dob=in.readUTF();
							for(MobileClient m:hmap.values())
							{
								System.out.println(m);
								if(m.getName().equals(name) && m.getDob().equals(sdf.parse(dob)))
									out.writeDouble(m.getBills().get(0));
							}
							
							
						}
							
							break;

						default:
							break;
						}
						
					
				}
				
				
				}
		
}

}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
}


}