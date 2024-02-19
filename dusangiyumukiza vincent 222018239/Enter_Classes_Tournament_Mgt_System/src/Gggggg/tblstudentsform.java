package Gggggg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tblstudentsform implements ActionListener{
	JFrame frame;
	JLabel studentid_lb=new JLabel("studentid");
	JLabel studentname_lb=new JLabel("studentname");
	JLabel rollid_lb=new JLabel("rollid");
	JLabel gender_lb=new JLabel("gender");
	JLabel DOB_lb=new JLabel("DOB");
	JLabel classid_lb=new JLabel("classid");
	JLabel regdate_lb=new JLabel("regdate");
	JLabel updationdate_lb=new JLabel("updationdate");
	   
	JTextField studentid_txf=new JTextField();
	JTextField studentname_txf=new JTextField();
	JTextField rollid_txf=new JTextField();
	JTextField gender_txf=new JTextField();
	JTextField DOB_txf=new JTextField();
	JTextField classid_txf=new JTextField();
	JTextField regdate_txf=new JTextField();
	JTextField updationdate_txf=new JTextField();

    //Buttons CRUD
	JButton insert_btn=new JButton("Insert");
	JButton Read_btn=new JButton("View");
	JButton update_tbtn=new JButton("Update");
	JButton delete_btn=new JButton("Delete");
	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	int w=(int) screensize.getWidth();
	int h=(int) screensize.getHeight();
	public tblstudentsform() {
		createForm();
		ActionEvent();
		setLocationandSize();
		setFontforall();
		addcomponentforFrame();

	}
	private void ActionEvent() {
		insert_btn.addActionListener(this);
		Read_btn.addActionListener(this);
		update_tbtn.addActionListener(this);
		delete_btn.addActionListener(this);
		//genderBox.addActionListener(this);
	}
	private void createForm() {
		frame=new JFrame();
		frame.setTitle("table results");
		frame.setBounds(0, 0, w/2, h/2);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.green);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
	}


	private void setLocationandSize() {
		studentid_lb.setBounds(10, 10, 100, 30);
		studentname_lb.setBounds(10, 50, 130, 30);
		classid_lb.setBounds(10, 90, 130, 30);
		rollid_lb.setBounds(10, 130, 160, 30);
		DOB_lb.setBounds(10, 170, 170, 30);
		regdate_lb.setBounds(10, 210, 130, 30);
		updationdate_lb.setBounds(10, 250, 130, 30);
		
		studentid_txf.setBounds(170, 10, 130, 30);
		studentname_txf.setBounds(170, 50, 130, 30);
		classid_txf.setBounds(170, 90, 130, 30);
		rollid_txf.setBounds(170, 130, 130, 30);
		DOB_txf.setBounds(170, 170, 130, 30);
		regdate_txf.setBounds(170, 210, 130, 30);
		updationdate_txf.setBounds(170, 250, 130, 30);
		
		
        //Buttons CRUD
		insert_btn.setBounds(20,370, 85, 30);
		Read_btn.setBounds(110,370, 85, 30);
		update_tbtn.setBounds(200,370, 85, 30);
		delete_btn.setBounds(290,370, 85, 30);
		}
	private void setFontforall() {
		Font font = new Font("Times New Roman", Font.BOLD, 20);

		studentid_lb.setFont(font);
		studentname_lb.setFont(font);
		classid_lb.setFont(font);
		gender_lb.setFont(font);
		rollid_lb.setFont(font);
	    DOB_lb.setFont(font);
	    regdate_lb.setFont(font);
		updationdate_lb.setFont(font);
		
		
		studentid_txf.setFont(font);
		studentname_txf.setFont(font);
		classid_txf.setFont(font);
		gender_txf.setFont(font);
		rollid_txf.setFont(font);
		regdate_lb.setFont(font);
		updationdate_txf.setFont(font);
	
		Font fonti = new Font("Courier New", Font.ITALIC, 12);

		insert_btn.setFont(fonti);
		Read_btn.setFont(fonti);
		update_tbtn.setFont(fonti);
		delete_btn.setFont(fonti);

	}
	private void addcomponentforFrame() {
		frame.add(studentid_lb);
		frame.add(studentname_lb);
		frame.add(classid_lb);
		frame.add(gender_lb);
		frame.add(rollid_lb);
		frame.add(regdate_lb);
		frame.add(updationdate_lb);
		
		
		frame.add(studentid_txf);
		frame.add(studentname_txf);
		frame.add(classid_txf);
		frame.add(gender_txf);
		frame.add(rollid_txf);
		frame.add(regdate_txf);
		frame.add(updationdate_txf);
		
		
		//Buttons CRUD
		frame.add(insert_btn);
		frame.add(Read_btn);
		frame.add(update_tbtn);
		frame.add(delete_btn);
		
	}
	


	
	
	

	public static void main(String[] args) {
		tblstudentsform mtf=new tblstudentsform();	

	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
