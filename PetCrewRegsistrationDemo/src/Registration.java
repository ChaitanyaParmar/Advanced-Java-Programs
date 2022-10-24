import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.sql.*;
import java.util.Map;

class Pet implements ActionListener{
	JFrame j;
	JLabel lblReg, lblName, lblEmail, lblContactNo, lblGender, lblPassword, lblCPassword, lblNone, lblImage;
	JTextField txtName, txtEmail, txtContactNo;
	JRadioButton radMale, radFemale, radOther;
	ButtonGroup grpGender;
	JPasswordField txtPassword, txtCPassword;
	JButton btnRegister, btnReset;
	ImageIcon img=new ImageIcon("D:/dog.jpg");
	
	Pet(){
		j = new JFrame();
		
		j.setTitle("Registration Form");
        j.setBounds(470, 50, 1000, 100);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        j.getContentPane().setBackground(Color.WHITE);
		        
        lblImage = new JLabel("",img,JLabel.CENTER);
        lblImage.setBounds(45, 370, 600, 500);
        j.add(lblImage);
        
		lblReg = new JLabel("Registration Form");
		Font font = lblReg.getFont();
		lblReg.setFont(new Font("Serif", Font.PLAIN, 30));
		lblReg.setBounds(240, 20, 500, 40);
		j.add(lblReg);
		
		lblName = new JLabel("Full Name: ");
		lblName.setFont(new Font("Serif", Font.PLAIN,16));
        lblName.setBounds(90, 100, 120, 20);
        j.add(lblName);
        
        txtName = new JTextField();
        txtName.setFont(new Font("Serif", Font.PLAIN,16));
        txtName.setBounds(250, 97, 300, 30);
        j.add(txtName);
        
        lblEmail = new JLabel("Email: ");
        lblEmail.setFont(new Font("Serif", Font.PLAIN,16));
        lblEmail.setBounds(90, 150, 120, 20);
        j.add(lblEmail);
        
        txtEmail = new JTextField();
        txtEmail.setFont(new Font("Serif", Font.PLAIN,16));
        txtEmail.setBounds(250, 147, 300, 30);
        j.add(txtEmail);
        
        lblContactNo = new JLabel("Contact No: ");
        lblContactNo.setFont(new Font("Serif", Font.PLAIN,16));
        lblContactNo.setBounds(90, 200, 120, 20);
        j.add(lblContactNo);
        
        txtContactNo = new JTextField();
        txtContactNo.setFont(new Font("Serif", Font.PLAIN,16));
        txtContactNo.setBounds(250, 197, 300, 30);
        j.add(txtContactNo);
        
        lblGender = new JLabel("Gender: ");
        lblGender.setFont(new Font("Serif", Font.PLAIN,16));
        lblGender.setBounds(90, 250, 120, 20);
        j.add(lblGender);
        
        radMale = new JRadioButton("Male");
        radMale.setFont(new Font("Serif", Font.PLAIN,16));
        radMale.setSelected(true);
        radMale.setBackground(Color.WHITE);
        radMale.setBounds(250, 247, 80, 30);
        j.add(radMale);
        
        radFemale = new JRadioButton("Female");
        radFemale.setFont(new Font("Serif", Font.PLAIN,16));
        radFemale.setBounds(340, 247, 80, 30);
        radFemale.setBackground(Color.WHITE);
        j.add(radFemale);
        
        radOther = new JRadioButton("Other");
        radOther.setFont(new Font("Serif", Font.PLAIN,16));
        radOther.setBounds(430, 247, 80, 30);
        radOther.setBackground(Color.WHITE);
        j.add(radOther);
        
        grpGender = new ButtonGroup();
        grpGender.add(radMale);
        grpGender.add(radFemale);
        grpGender.add(radOther);
        
        lblPassword = new JLabel("Password: ");
        lblPassword.setFont(new Font("Serif", Font.PLAIN,16));
        lblPassword.setBounds(90, 300, 120, 20);
        j.add(lblPassword);
        
        txtPassword = new JPasswordField();
        txtPassword.setFont(new Font("Serif", Font.PLAIN,16));
        txtPassword.setBounds(250, 297, 300, 30);
        j.add(txtPassword);
        
        lblCPassword = new JLabel("Confirm Password: ");
        lblCPassword.setFont(new Font("Serif", Font.PLAIN,16));
        lblCPassword.setBounds(90, 350, 140, 20);
        j.add(lblCPassword);
        
        txtCPassword = new JPasswordField();
        txtCPassword.setFont(new Font("Serif", Font.PLAIN,16));
        txtCPassword.setBounds(250, 347, 300, 30);
        j.add(txtCPassword);
        
        btnRegister = new JButton("Register");
        btnRegister.setFont(new Font("Arial", Font.PLAIN,16));
        btnRegister.setBackground(Color.WHITE);
        btnRegister.setBounds(210, 430, 120, 40);
        btnRegister.addActionListener(this);
        j.add(btnRegister);
        
        btnReset = new JButton("Reset");
        btnReset.setFont(new Font("Arial", Font.PLAIN,16));
		btnReset.setBackground(Color.WHITE);
        btnReset.setBounds(370, 430, 120, 40);
        btnReset.addActionListener(this);
        j.add(btnReset);
        
        lblNone = new JLabel("");
		j.add(lblNone);
			//		lblImage = new JLabel("",img,JLabel.BOTTOM);
//		lblImage.setBounds(400,50,120,40);
//		j.add(lblImage);
		
		j.setVisible(true);	
		j.setLayout(null);	
		j.setSize(700, 800);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRegister){
			String name, email, contact, gender, password;
			name = txtName.getText();
			email = txtEmail.getText();
			contact = txtContactNo.getText();
			password = txtPassword.getText();
			gender = "";
			if(radMale.isSelected()) {
				gender = "Male";
			}
			else if(radFemale.isSelected()) {
				gender = "Female";
			}
			else if(radOther.isSelected()) {
				gender = "Other";
			}
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcdemo", "root", "admin");
				Statement s = conn.createStatement();
				
				PreparedStatement ps = conn.prepareStatement("Insert into userdata(name, email, contact, gender, password) Values(?,?,?,?,?);");
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3, contact);
				ps.setString(4, gender);
				ps.setString(5, password);
				ps.executeUpdate();
				System.out.println("Records Inserted Successfully!");
				s.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			} 
			
		}
		else if(e.getSource() == btnReset) {
			String def = "";
            txtName.setText(def);	
            txtEmail.setText(def);
            txtContactNo.setText(def);
            txtPassword.setText(def);
            txtCPassword.setText(def);
            radMale.setSelected(true);
		}
	}	
}

public class Registration {
	public static void main(String[] args) throws SQLException{
		new Pet();
	}

}
