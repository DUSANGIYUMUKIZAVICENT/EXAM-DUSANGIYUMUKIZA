package Sssssss;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Matchesform implements ActionListener{
	JFrame frame;
	JLabel match_id_lb=new JLabel("match_id");
	JLabel date_lb=new JLabel("date");
	JLabel play_ground_lb=new JLabel("play_ground");
	JLabel ref_id_lb=new JLabel("reference_id");
	JLabel ad_id_lb=new JLabel("adversaries_id");
	JLabel user_id_lb=new JLabel("users_id");
   
	JTextField match_id_txf=new JTextField();
	JTextField date_txf=new JTextField();
	JTextField play_ground_txf=new JTextField();
	JTextField ref_id_txf=new JTextField();
	JTextField ad_id_txf=new JTextField();
	JTextField user_id_txf=new JTextField();

    //Buttons CRUD
	JButton insert_btn=new JButton("Insert");
	JButton Read_btn=new JButton("View");
	JButton update_tbtn=new JButton("Update");
	JButton delete_btn=new JButton("Delete");
	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	int w=(int) screensize.getWidth();
	int h=(int) screensize.getHeight();
	public Matchesform() {
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
		frame.setTitle("Matches Form");
		frame.setBounds(0, 0, w/2, h/2);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.white);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
	}


	private void setLocationandSize() {
		match_id_lb.setBounds(10, 10, 100, 30);
		date_lb.setBounds(10, 50, 130, 30);
		play_ground_lb.setBounds(10, 90, 130, 30);
		ref_id_lb.setBounds(10, 130, 160, 30);
		ad_id_lb.setBounds(10, 170, 150, 30);
		user_id_lb.setBounds(10, 210, 130, 30);
		
		match_id_txf.setBounds(170, 10, 130, 30);
		date_txf.setBounds(170, 50, 130, 30);
		play_ground_txf.setBounds(170, 90, 130, 30);
		ref_id_txf.setBounds(170, 130, 130, 30);
		ad_id_txf.setBounds(170, 170, 130, 30);
		user_id_txf.setBounds(170, 210, 130, 30);
		
		
        //Buttons CRUD
		insert_btn.setBounds(10,270, 85, 30);
		Read_btn.setBounds(100,270, 85, 30);
		update_tbtn.setBounds(190,270, 85, 30);
		delete_btn.setBounds(280,270, 85, 30);
		}
	private void setFontforall() {
		Font font = new Font("Times New Roman", Font.BOLD, 20);

		match_id_lb.setFont(font);
		date_lb.setFont(font);
		play_ground_lb.setFont(font);
		ref_id_lb.setFont(font);
		ad_id_lb.setFont(font);
		user_id_lb.setFont(font);
		
		match_id_txf.setFont(font);
		date_txf.setFont(font);
		play_ground_txf.setFont(font);
		ref_id_txf.setFont(font);
		ad_id_txf.setFont(font);
		user_id_txf.setFont(font);
	
		Font fonti = new Font("Courier New", Font.ITALIC, 12);

		insert_btn.setFont(fonti);
		Read_btn.setFont(fonti);
		update_tbtn.setFont(fonti);
		delete_btn.setFont(fonti);

	}
	private void addcomponentforFrame() {
		frame.add(match_id_lb);
		frame.add(date_lb);
		frame.add(play_ground_lb);
		frame.add(ref_id_lb);
		frame.add(ad_id_lb);
		frame.add(user_id_lb);
		
		
		frame.add(match_id_txf);
		frame.add(date_txf);
		frame.add(play_ground_txf);
		frame.add(ref_id_txf);
		frame.add(ad_id_txf);
		frame.add(user_id_txf);
		
		
		//Buttons CRUD
		frame.add(insert_btn);
		frame.add(Read_btn);
		frame.add(update_tbtn);
		frame.add(delete_btn);
		
	}
	


	
	
	

	public static void main(String[] args) {
		Matchesform mtf=new Matchesform();	

	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
