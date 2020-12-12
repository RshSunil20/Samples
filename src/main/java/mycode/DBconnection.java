package mycode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnection{
	
	
	public static void main(String[] args) {
	try {
	//1. Load driver class	
		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//2. create connection object
	
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MyDB", "user", "password");
	
	//3. create statement object
	
	Statement stmt = con.createStatement();
	
	//4. execute query
	
	ResultSet rs = stmt.executeQuery("select * from students");
	
	while(rs.next())
	System.out.println(rs.getInt(1)+ " "+rs.getString(2));
	
	con.close();
    } catch(Exception e) {System.out.println(e);}
  }
}