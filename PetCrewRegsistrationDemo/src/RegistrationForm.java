import javax.swing.*;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException; 

class RegForm implements ActionListener,KeyListener{
	JFrame f;
	JLabel lblregForm,lblfname,lbllname,lblemail,lbluname,lblpass,lblcpass,lbladd,lblgender,lblnone,lblback;
	JTextField txtFname,txtLname,txtEmail,txtUname;
	JTextArea txtadd;
	JRadioButton radMale,radFemale;
	ButtonGroup btnGrpGen;
	JButton btnSignUp, btnReset;
	JPasswordField txtPass, txtCpass;
	ImageIcon img = new ImageIcon("back.jpg");
	
	RegForm(){
		f = new JFrame();
		Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		
	
		f.setTitle("Registration Form");
        f.setBounds(500, 20, 1000, 100);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.BLACK);
		
		lblregForm = new JLabel("Registration Form");
		lblregForm.setFont(new Font("Arial", Font.PLAIN,30));
		lblregForm.setForeground(Color.YELLOW);
		lblregForm.setBounds(220,20,500,40);
		f.add(lblregForm);
		
		lblfname = new JLabel("First Name :");
		lblfname.setFont(new Font("Arial", Font.PLAIN,16));
		lblfname.setForeground(Color.LIGHT_GRAY);		
		lblfname.setBounds(50, 60, 100, 30);
		f.add(lblfname);
		
		txtFname = new JTextField();
		txtFname.setBounds(50, 90, 300, 30);
		txtFname.setBackground(Color.black);
		txtFname.setFont(new Font("Arial", Font.PLAIN,16));
		txtFname.setForeground(Color.white);
//		txtFname.setCaretColor(Color.white);
		txtFname.setBorder(border);
		
		txtFname.addKeyListener((KeyListener) this);

		f.add(txtFname);
		
		lbllname = new JLabel("Last Name :");
		lbllname.setFont(new Font("Arial", Font.PLAIN,16));
		lbllname.setForeground(Color.LIGHT_GRAY);
		lbllname.setBounds(50, 130, 100, 30);
		f.add(lbllname);
		
		txtLname = new JTextField();
		txtLname.setBounds(50, 160, 300, 30);
		txtLname.setBackground(Color.black);
		txtLname.setFont(new Font("Arial", Font.PLAIN,16));
		txtLname.setForeground(Color.white);
		txtLname.setCaretColor(Color.white);
		txtLname.setBorder(border);
		txtLname.addKeyListener((KeyListener) this);
		f.add(txtLname);
		
		lblemail = new JLabel("Email :");
		lblemail.setFont(new Font("Arial", Font.PLAIN,16));
		lblemail.setForeground(Color.LIGHT_GRAY);
		lblemail.setBounds(50, 200, 100, 30);
		f.add(lblemail);
		
		txtEmail= new JTextField();
		txtEmail.setBounds(50, 230, 300, 30);
		txtEmail.setBackground(Color.black);
		txtEmail.setFont(new Font("Arial", Font.PLAIN,16));
		txtEmail.setForeground(Color.white);
		txtEmail.setCaretColor(Color.white);
		txtEmail.setBorder(border);
		f.add(txtEmail);
		
		lbluname = new JLabel("Username :");
		lbluname.setFont(new Font("Arial", Font.PLAIN,16));
		lbluname.setForeground(Color.LIGHT_GRAY);
		lbluname.setBounds(50, 270, 120, 30);
		f.add(lbluname);
		
		txtUname= new JTextField();
		txtUname.setBounds(50, 300, 300, 30);
		txtUname.setBackground(Color.black);
		txtUname.setFont(new Font("Arial", Font.PLAIN,16));
		txtUname.setForeground(Color.white);
		txtUname.setCaretColor(Color.white);
		txtUname.setBorder(border);
		f.add(txtUname);
		
		lblpass = new JLabel("Password :");
		lblpass.setFont(new Font("Arial", Font.PLAIN,16));
		lblpass.setForeground(Color.LIGHT_GRAY);
		lblpass.setBounds(50, 340, 120, 30);
		f.add(lblpass);
		
		txtPass= new JPasswordField();
		txtPass.setBounds(50, 370, 300, 30);
		txtPass.setBackground(Color.black);
		txtPass.setFont(new Font("Arial", Font.PLAIN,16));
		txtPass.setForeground(Color.white);
		txtPass.setCaretColor(Color.white);
		txtPass.setBorder(border);
		f.add(txtPass);
		
		lblcpass = new JLabel("Confirm Password :");
		lblcpass.setFont(new Font("Arial", Font.PLAIN,16));
		lblcpass.setForeground(Color.LIGHT_GRAY);
		lblcpass.setBounds(50, 410, 200, 30);
		f.add(lblcpass);
		
		txtCpass= new JPasswordField();
		txtCpass.setBounds(50, 440, 300, 30);
		txtCpass.setBackground(Color.black);
		txtCpass.setFont(new Font("Arial", Font.PLAIN,16));
		txtCpass.setForeground(Color.white);
		txtCpass.setCaretColor(Color.white);
		txtCpass.setBorder(border);
		f.add(txtCpass);
		
		lblgender = new JLabel("Select Gender :");
		lblgender.setFont(new Font("Arial", Font.PLAIN,16));
		lblgender.setForeground(Color.LIGHT_GRAY);
		lblgender.setBounds(50, 480, 150, 30);
		f.add(lblgender);
		
		radMale = new  JRadioButton("Male");
		radMale.setFont(new Font("Arial", Font.PLAIN,16));
		radMale.setBackground(Color.black);
		radMale.setForeground(Color.white);
		radMale.setSelected(true);
		radMale.setBounds(200,480,100,30);
		f.add(radMale);
		
		radFemale = new  JRadioButton("Female");
		radFemale.setFont(new Font("Arial", Font.PLAIN,16));
		radFemale.setBackground(Color.black);
		radFemale.setForeground(Color.white);
		radFemale.setBounds(300,480,100,30);
		f.add(radFemale);
		
		btnGrpGen = new ButtonGroup();
        btnGrpGen.add(radMale);
        btnGrpGen.add(radFemale);
        
        lbladd = new JLabel("Address :");
        lbladd.setFont(new Font("Arial", Font.PLAIN,16));
        lbladd.setForeground(Color.LIGHT_GRAY);
		lbladd.setBounds(50, 520, 150, 30);
		f.add(lbladd);
		
		txtadd = new JTextArea();
		txtadd.setBounds(50, 550, 300, 80);
		txtadd.setBackground(Color.black);
		txtadd.setFont(new Font("Arial", Font.PLAIN,16));
		txtadd.setForeground(Color.white);
		txtadd.setCaretColor(Color.white);
		txtadd.setBorder(border);
		txtadd.setLineWrap(true);
		f.add(txtadd);
		
		btnSignUp = new JButton("SignUp");
		btnSignUp.setBounds(50,650,100,40);
		btnSignUp.setFont(new Font("Arial", Font.PLAIN,16));
		btnSignUp.setBackground(Color.YELLOW);
		btnSignUp.addActionListener(this);
		f.add(btnSignUp);
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(200,650,100,40);
		btnReset.setFont(new Font("Arial", Font.PLAIN,16));
		btnReset.setBackground(Color.YELLOW);
		btnReset.addActionListener(this);
		f.add(btnReset);
		
		lblback = new JLabel("",img,JLabel.RIGHT);
		lblback.setBounds(400,50,500,500);
		f.add(lblback);
		
		lblnone = new JLabel("");
		f.add(lblnone);
		
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(950,800);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSignUp) {
			String email,uname,pass="",gen,add,fname,lname,cpass="";
			int err=0;
			String regex = "^(.+)@(.+)$";  
			
//			geeting values from the textfields and validating 
			
			fname = txtFname.getText();
			lname = txtLname.getText();
			
//			validating email
			
			email = txtEmail.getText();
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);  
			if(matcher.matches() == false) {
				JOptionPane.showMessageDialog(null, "Enter a valid email");
		        txtEmail.setText(" ");
		        err = 1;
			}
			
//			validation username
			
			uname = txtUname.getText();
			String regex1 = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
			Pattern pattern1 = Pattern.compile(regex1);
			Matcher matcher1 = pattern1.matcher(uname);
			if(matcher1.matches() == false) {
				JOptionPane.showMessageDialog(null, "Enter a valid username");
		        txtUname.setText(" ");
		        err = 1;
			}
			
//			validating password
			
			pass = txtPass.getText();
			cpass = txtCpass.getText();
			
			if(!pass.equals(cpass)) {
				JOptionPane.showMessageDialog(null, "Entered Passwords doesn't match");
		        txtPass.setText(" ");
		        txtCpass.setText(" ");
		        err = 1;
			}
			else if(pass.length() > 20) {
				JOptionPane.showMessageDialog(null, "Reduce the size of password from 20 chrs");
		        txtPass.setText(" ");
		        txtCpass.setText(" ");
		        err = 1;
			}
			
//			getting gender value from radio btn
			
			if(radMale.isSelected()){
				gen = "Male";
			}
			else {
				gen = "Female";
			}
			add = txtadd.getText();
			
//			checking if any of the values are left out empty
			
			if(fname.length() == 0|| lname.length() == 0 || add.length() == 0 || gen.length() == 0 || pass.length() == 0 || cpass.length() == 0 || uname.length() == 0) {
				JOptionPane.showMessageDialog(null, "Please fill the entire form");
		        err = 1;
			}
			
			
//			try {
//				  File myObj = new File("abc.txt");
//				  
//				  if(!myObj.exists()) {
//					  myObj.createNewFile();  
//				  }
//			      FileWriter myWriter = new FileWriter("abc.txt");
//			      myWriter.write(s1);
//			      myWriter.close();
//			      System.out.println("Successfully wrote to the file.");
//			    } catch (IOException ae){
//			      System.out.println("An error occurred.");
//			      ae.printStackTrace();
//			    }
			if(err == 0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","admin");
					Statement stmt = cnn.createStatement();
					
					PreparedStatement pst = cnn.prepareStatement("insert into user_detail(Fname,Lname,Email,Username,Password,Gender,Address) values(?,?,?,?,?,?,?)");
					pst.setString(1, fname);
					pst.setString(2, lname);
					pst.setString(3, email);
					pst.setString(4, uname);
					pst.setString(5, pass);
					pst.setString(6, gen);
					pst.setString(7, add);
					pst.executeUpdate();
					
					reset();
					JOptionPane.showMessageDialog(null, "Record Inserted Successfully...");
					stmt.close(); 
					cnn.close();
				}catch(Exception ae) {
					ae.printStackTrace();
				}
			}
		}
		else if(e.getSource() == btnReset) {
			reset();
		}
	}
	public void reset() {
		String def = "";
        txtFname.setText(def);
        txtLname.setText(def);
        txtEmail.setText(def);
        txtUname.setText(def);
        txtPass.setText(def);
        txtCpass.setText(def);
        txtadd.setText(def);
        radMale.setSelected(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		String emailValidation = "!#%&*()'+,-./:;<=>?[]^_`{|}";
		if(e.getSource() == txtFname) {
			char ch = e.getKeyChar();
			
			 if(Character.isDigit(ch) || ch == 32 || specialCharactersString.contains(Character.toString(ch))){
				 JOptionPane.showMessageDialog(null, "Only chars are allowed!");
		         txtFname.setText(" ");
	        }
	        
		}
		if(e.getSource() == txtLname) {
			char ch = e.getKeyChar();
			 
			 if(Character.isDigit(ch) || ch == 32 || specialCharactersString.contains(Character.toString(ch))){
				 JOptionPane.showMessageDialog(null, "Only chars are allowed!");
		         txtLname.setText(" ");
	        }
		}
	}
}
public class RegistrationForm {	
	public static void main(String[] args) {
		new RegForm();	
	}

}
