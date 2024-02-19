package rrrrr;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class refereesform implements ActionListener{
	JFrame frame;
	JLabel ref_id_lb=new JLabel ("ref_id");
	JLabel  f_namelb=new JLabel("f_name");
	JLabel l_name_lb=new JLabel("l_name");
	JLabel age_lb=new JLabel("age");
	JLabel sex_lb=new JLabel("sex");
	JLabel telephone_lb=new JLabel("telephone");
   
	JTextField ref_id__txf=new JTextField();
	JTextField f_name__txf=new JTextField();
	JTextField l_name_txf=new JTextField();
	JTextField age_txf=new JTextField();
	JTextField sex_txf=new JTextField();
	JTextField telephone_txf=new JTextField();

    //Buttons CRUD
	JButton insert_btn=new JButton("Insert");
	JButton Read_btn=new JButton("View");
	JButton update_tbtn=new JButton("Update");
	JButton delete_btn=new JButton("Delete");
	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	int w=(int) screensize.getWidth();
	int h=(int) screensize.getHeight();
	public refereesform() {
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
		frame.setTitle("Referees Form");
		frame.setBounds(0, 0, w/2, h/2);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.green);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
	}


	private void setLocationandSize() {
		ref_id_lb.setBounds(10, 10, 100, 30);
		f_namelb.setBounds(10, 50, 130, 30);
		l_name_lb.setBounds(10, 90, 130, 30);
		age_lb.setBounds(10, 130, 160, 30);
		sex_lb.setBounds(10, 170, 150, 30);
		telephone_lb.setBounds(10, 210, 130, 30);
		
		ref_id__txf.setBounds(170, 10, 130, 30);
		f_name__txf.setBounds(170, 50, 130, 30);
		l_name_txf.setBounds(170, 90, 130, 30);
		age_txf.setBounds(170, 130, 130, 30);
		sex_txf.setBounds(170, 170, 130, 30);
		telephone_txf.setBounds(170, 210, 130, 30);
		
		
        //Buttons CRUD
		insert_btn.setBounds(10,290, 85, 30);
		Read_btn.setBounds(100,290, 85, 30);
		update_tbtn.setBounds(190,290, 85, 30);
		delete_btn.setBounds(280,290, 85, 30);
		}
	private void setFontforall() {
		Font font = new Font("Times New Roman", Font.BOLD, 20);

		ref_id_lb.setFont(font);
		f_namelb.setFont(font);
		l_name_lb.setFont(font);
		age_lb.setFont(font);
		sex_lb.setFont(font);
		telephone_lb.setFont(font);
		
		ref_id__txf.setFont(font);
		f_name__txf.setFont(font);
		l_name_txf.setFont(font);
		age_txf.setFont(font);
		sex_txf.setFont(font);
		telephone_txf.setFont(font);
	
		Font fonti = new Font("Courier New", Font.ITALIC, 12);

		insert_btn.setFont(fonti);
		Read_btn.setFont(fonti);
		update_tbtn.setFont(fonti);
		delete_btn.setFont(fonti);

	}
	private void addcomponentforFrame() {
		frame.add(ref_id_lb);
		frame.add(f_namelb);
		frame.add(l_name_lb);
		frame.add(age_lb);
		frame.add(sex_lb);
		frame.add(telephone_lb);
		
		frame.add(ref_id__txf);
		frame.add(f_name__txf);
		frame.add(l_name_txf);
		frame.add(age_txf);
		frame.add(sex_txf);
		frame.add(telephone_txf);
		
		
		//Buttons CRUD
		frame.add(insert_btn);
		frame.add(Read_btn);
		frame.add(update_tbtn);
		frame.add(delete_btn);
		
	}
	
	
	


public static void main(String[] args) {
	refereesform rff=new refereesform();
}
@Override
public void actionPerformed(java.awt.event.ActionEvent e) {
	// TODO Auto-generated method stub
	
}}