package practicalSet2;

import java.awt.*;

public class prac12 extends Frame{
	
	Button btn_save=new Button("save");
	Label l11=new Label("STUDENT DETAILS FORM:",Label.CENTER);
	Label l1=new Label("Name:",Label.LEFT);
	Label l2=new Label("Enrollment No:",Label.LEFT);
	Label l3=new Label("Gender:",Label.LEFT);
	Label l4=new Label("Course:",Label.LEFT);
	Label l5=new Label("Semester:",Label.LEFT);
	Label l6=new Label("",Label.RIGHT);
	TextField t1=new TextField();
	TextField age=new TextField();
	Choice c1=new Choice();
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox ck1=new Checkbox("Male",false,cbg);
	Checkbox ck2=new Checkbox("Female",false,cbg);
	Choice course=new Choice();
	Choice sem=new Choice();
	
	public prac12(){
		
		setBackground(Color.WHITE);
		setForeground(Color.black);
		setLayout(null);
		
		add(l11);
		add(l1);
		add(l2);
		add(l3);
		add(l4); 
		add(l5);
		add(l6);
		add(t1);
		add(age);
		add(ck1);
		add(ck2);
		add(course);
		add(sem);
		add(age);	
		add(btn_save);
		
		course.add("Computer");
		course.add("Civil");
		course.add("Mechanical");
		course.add("IT");
		
		sem.add("1");
		sem.add("2");
		sem.add("3");
		sem.add("4");
		sem.add("5");
		sem.add("6");
		
		l1.setBounds(25,65,90,20);
		l2.setBounds(25,90,90,20);
		l3.setBounds(25,120,90,20);
		l4.setBounds(25,165,90,20);
		l5.setBounds(25,220,90,20);
		l6.setBounds(25,290,90,20);
		l11.setBounds(10,40,280,20);
		t1.setBounds(120,65,170,20);
		course.setBounds(120,165,170,60);
		ck1.setBounds(120,120,50,20);
		ck2.setBounds(170,120,60,20);
		sem.setBounds(120,220,100,20);

		age.setBounds(120,90,170,20);

		btn_save.setBounds(120,320,50,30);
		
	}
	
	public static void main(String g[]){
		prac12 a = new prac12();
		a.setVisible(true);
		a.setSize(400,400);
	}
}
