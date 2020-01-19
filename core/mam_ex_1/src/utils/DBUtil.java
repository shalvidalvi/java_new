package utils;

import java.sql.*;


public class DBUtil {
 public static Connection fetchConnection() throws SQLException,ClassNotFoundException
 {
	 String url="jdbc:mysql://localhost:3333/test1";
	 return DriverManager.getConnection(url, "root", "actscdac");
 }
}
