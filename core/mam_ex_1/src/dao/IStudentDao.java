package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.Students;
import validationRule.StudentException;

public interface IStudentDao {
	

	List<Students> getStudentDetails(String course) throws SQLException;
	
	List<Students> details() throws SQLException;
	
	String addStudent(Students o) throws SQLException;
	
	String removeStudent(int i) throws SQLException, StudentException;
	
	String updateMarks(int i,int j) throws SQLException, StudentException;
	
	Students getTopper(String c) throws SQLException;
	

}
