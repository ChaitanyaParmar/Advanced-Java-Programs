package practicalSet3;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class prac17 {
	static final String JDBC_driver = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3307/dbdemo";
	static final String URNAME = "root";
	static final String PASS = "admin";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName(JDBC_driver);
		Connection conn = DriverManager.getConnection(DB_URL, URNAME, PASS);
		System.out.println("Connected");
		java.sql.Statement stat = conn.createStatement();
		Frame f = new Frame("Practical 17");
		Button bprice = new Button("Show Price");
		Label lname = new Label("Product Name:");
		Choice pname = new Choice();
		Label lprice = new Label("Product Price:");
		final TextField tprice = new TextField();
		pname.add("Select Product");
		pname.add("T-Shirt");
		pname.add("Shirt");
		pname.add("Cap");
		pname.add("Hoodie");
		pname.add("Jeans");
		pname.add("Shorts");
		bprice.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 try {
					 String sql = "select price from product where name='" + pname.getSelectedItem() + "';";
					 ResultSet result = stat.executeQuery(sql);
					 if (result.next()) {
						 tprice.setText(result.getString(1));
					 }
					 else {
						 tprice.setText("No data Found");
					 }
				  } catch (Exception ae) {
				 		System.out.println("Something Went Wrong!! "+e);
				  }
				 }
		});
		lname.setBounds(100, 50, 100, 20);
		pname.setBounds(200, 50, 200, 20);
		lprice.setBounds(100, 80, 100, 20);
		tprice.setBounds(200, 80, 200, 20);
		bprice.setBounds(230, 130, 70, 30);
		f.add(lname);
		f.add(pname);
		f.add(lprice);
		f.add(tprice);
		f.add(bprice);
		f.setTitle("Practical 17");
		f.setSize(500, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		 });
	 }
}

