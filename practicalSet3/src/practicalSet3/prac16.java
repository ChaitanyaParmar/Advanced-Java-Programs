package practicalSet3;

import java.sql.*;
public class prac16 {
	static final String JDBC_driver = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3307/dbdemo";
	static final String URNAME = "root";
	static final String PASS = "admin";
	public static void main(String[] args) {
		try {
			Class.forName(JDBC_driver);
			Connection conn = DriverManager.getConnection(DB_URL,URNAME, PASS);
			Statement stat = conn.createStatement();
			String query = "Select * from employee where EMP_SAL>2000 and EMP_SAL<6000;";
			ResultSet result = stat.executeQuery(query);
			while (result.next()) {
				System.out.println();
				System.out.println("Employee Name:" + result.getString("EMP_NAME"));
				System.out.println("Employee Salary:"+ result.getString("EMP_SAL"));	
			}
		} 
		catch (Exception e) {
			System.out.println("Something Went Wrong!! "+e);
		}
	}
}
