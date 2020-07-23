import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;


public class jdbcConnection {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		
		String host = "localhost";
		String port = "3306";
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/Qadbt", "root", "Django@2020");
        
		//conn object has all the information about the database.
		
		Statement s = conn.createStatement();
		
		ResultSet rs = s.executeQuery("Select * from Employeeinfo where name = 'Ham'");  //where EmployeeInfo is the table in Qadbt database.
		
		// In the above statement resultSet object will store the results of the query passed through statement s object. and it is a set so by default it
        //points to base index so using command "rs.next()" we will have to point to first index of set where data will be retrieved.
        //we will write it like if rs.next() exists i.e. it doesn't return an empty value keep executing the queries and printing their results.
		
		while (rs.next()) {
			
			System.out.println(rs.getString("location"));
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getInt("age"));
		}
	}
}
