package tester;

import static javax.swing.JOptionPane.showInputDialog;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in);
				Socket s1=new Socket("localhost",5000);){
			
			boolean flag=false;
			try(DataOutputStream out=new DataOutputStream(s1.getOutputStream());
					DataInputStream in=new DataInputStream(s1.getInputStream());
							ObjectInputStream in1=new ObjectInputStream(s1.getInputStream()))
			{
				while(!flag)
				{
					System.out.println("1. Current month bill by mobile no");
					System.out.println("2. Last 6 months bill by mobile no");
					System.out.println("3. Cureent month bill by name and dob");
					System.out.println("Enter your choice:");
					try
					{
						switch (sc.nextInt()) {
						case 1:
						{
							System.out.println("enter mobile no");
							out.writeInt(1);
							out.writeUTF(sc.next());
							System.out.println("Your current bill is:"+in.readDouble());
							
						}
							
							break;
						case 2:
						{
							System.out.println("enter mobile no");
							out.writeInt(2);
							out.writeUTF(sc.next());
							System.out.println(in1.readObject());
							
						}
							
							break;
						case 3:
						{
							System.out.println("entername and dob");
							out.writeInt(3);
							out.writeUTF(sc.next());
							out.writeUTF(sc.next());
							System.out.println("Your current bill is:"+in.readDouble());
							//System.out.println(in1.readObject());
							
						}
							
							break;


						case 4:
							flag=true;
							break;
						}
						
					}
					catch(Exception e)
					{
						sc.nextLine();
						e.printStackTrace();
					}
					
				
				}
				
			 } 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
