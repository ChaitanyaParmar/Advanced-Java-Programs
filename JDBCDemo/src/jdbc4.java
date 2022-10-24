import java.sql.*;

public class jdbc4{
	static final String JDBC_driver = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3307/jdbcdemo";
	static final String USER = "root";
	static final String PASS = "admin";
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		try {
			Class.forName(JDBC_driver);
			System.out.println("Connecting to Database");
			System.out.println("Inserting Records into Table");
			PreparedStatement pst = conn.prepareStatement("Insert into student values(?, ?);");
			pst.setInt(1, 1);
			pst.setString(2, "Chaitanya");
			pst.executeUpdate();
			
			pst.setInt(1, 2);
			pst.setString(2, "Aryan");
			pst.executeUpdate();
			
			pst.setInt(1, 3);
			pst.setString(2, "Vraj");
			pst.executeUpdate();
			
			System.out.println("Records Inserted Successfully");
		}
		catch (Exception e) {
			System.out.println("Something Went Wrong!! "+e);
		}
		conn.close();
	}
}
