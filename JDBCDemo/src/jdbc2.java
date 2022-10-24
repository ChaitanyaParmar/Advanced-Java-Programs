import java.sql.*;
public class jdbc2 {
	static final String JDBC_driver = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3307/jdbcdemo";
	static final String URNAME = "root";
	static final String PASS = "admin";
	public static void main(String[] args) throws SQLException{
		Connection conn = DriverManager.getConnection(DB_URL,URNAME, PASS);
		try {
			Class.forName(JDBC_driver);
			Statement stat = conn.createStatement();
			String query = "Select * from jdbcdemo1";
			ResultSet result = stat.executeQuery(query);
			while (result.next()) {
				System.out.println("Name : " + result.getString("NAME"));
				System.out.println("Contact : "+ result.getString("CONTACT"));
				System.out.println("Department : "+ result.getString("DEPT"));
				System.out.println();
			}
		} 
		catch (Exception e) {
			System.out.println("Something Went Wrong!! "+e);
		}
		conn.close();
	}
}

