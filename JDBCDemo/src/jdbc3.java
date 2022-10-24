import java.sql.*;

public class jdbc3 {
	static final String JDBC_driver = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3307/jdbcdemo";
	static final String USER = "root"	;
	static final String PASS = "admin";
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		try {
			Class.forName(JDBC_driver);
			System.out.println("Connecting to Database");
			System.out.println("Creating Table");
			Statement stat = conn.createStatement();
			String sql = "Create Table Student(no int, name varchar(50));";
			stat.executeUpdate(sql);
			System.out.println("Table Created");
			
		}
		catch (Exception e) {
			System.out.println("Something Went Wrong!! "+e);
		}
		conn.close();
	}

}
