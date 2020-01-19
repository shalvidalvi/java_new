package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static utils.DBUtil.*;
import pojos.Students;
import validationRule.*;
public class StudentsDaoImpl implements IStudentDao{
	
	Connection cn;
	PreparedStatement pst1,pst2,pst3;
	
	public StudentsDaoImpl() throws Exception
	{
		cn=fetchConnection();
		pst1=cn.prepareStatement("select s.* from students s,course c where s.course_id=c.course_id and c.name=?");
		pst2=cn.prepareStatement("update students set marks=? where id=?");
		pst3=cn.prepareStatement("delete from students where id=?");
		
		
		
	}
	public void cleanup() throws Exception
	{
		if(pst1!=null)
			pst1.close();
		if(pst2!=null)
			pst2.close();
		
		if(cn!=null)
			cn.close();
	}
	
	
	
//	int id, String name, String email, String address,int marks,int course_id
	

	@Override
	public List<Students> getStudentDetails(String course) throws SQLException {
		// TODO Auto-generated method stub
		List<Students> list=new ArrayList<>();
		pst1.setString(1, course);
		
		try(ResultSet rst=pst1.executeQuery())
		{
			while(rst.next())
			{
				list.add(new Students(rst.getInt(1),rst.getInt(5),rst.getInt(6),rst.getString(2),rst.getString(3),rst.getString(4)));
			}
		}
		
		return list;
	}

	@Override
	public List<Students> details() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addStudent(Students o) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeStudent(int i) throws SQLException,StudentException {
		// TODO Auto-generated method stub
	
		pst3.setInt(1, i);
		int a=	pst3.executeUpdate();
		if(a==1)
		{
			return "success";
		}
		throw new StudentException("invalid id");
		/*
		 * try(ResultSet rst=pst3.executeQuery()) {
		 * 
		 * }
		 */
	}

	@Override
	public String updateMarks(int i, int j) throws  StudentException, SQLException {
		// TODO Auto-generated method stub
		
		pst2.setInt(1, j);
		pst2.setInt(2, i);
		int a=	pst2.executeUpdate();
		if(a==1)
		{
			return "success";
		}
		throw new StudentException("invalid id");
	}

	@Override
	public Students getTopper(String c) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
