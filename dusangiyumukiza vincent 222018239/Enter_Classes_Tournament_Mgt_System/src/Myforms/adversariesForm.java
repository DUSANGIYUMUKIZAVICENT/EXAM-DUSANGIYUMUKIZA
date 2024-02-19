package Myforms;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class adversariesForm implements ActionListener{
	JFrame frame;
	JLabel ad_id_lb=new JLabel("ad_id");
	JLabel name_lb=new JLabel("name");
   
	JTextField ad_id_txf=new JTextField();
	JTextField name_txf=new JTextField();

    //Buttons CRUD
	JButton insert_btn=new JButton("Insert");
	JButton Read_btn=new JButton("View");
	JButton update_tbtn=new JButton("Update");
	JButton delete_btn=new JButton("Delete");
	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	int w=(int) screensize.getWidth();
	int h=(int) screensize.getHeight();
	public adversariesForm() {
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
		frame.setTitle("Adversaries form");
		frame.setBounds(0, 0, w/2, h/2);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.yellow);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
	}


	private void setLocationandSize() {
		ad_id_lb.setBounds(10, 10, 100, 30);
		name_lb.setBounds(10, 50, 130, 30);
		
		
		ad_id_txf.setBounds(160, 10, 130, 30);
		name_txf.setBounds(160, 50, 130, 30);
		
		
        //Buttons CRUD
		insert_btn.setBounds(10,250, 85, 30);
		Read_btn.setBounds(100,250, 85, 30);
		update_tbtn.setBounds(190,250, 85, 30);
		delete_btn.setBounds(280,250, 85, 30);
		

	}
	private void setFontforall() {
		Font font = new Font("Times New Roman", Font.BOLD, 20);

		ad_id_lb.setFont(font);
		name_lb.setFont(font);
		

	    ad_id_txf.setFont(font);
		name_txf.setFont(font);
		
		
		Font fonti = new Font("Courier New", Font.ITALIC, 12);

		insert_btn.setFont(fonti);
		Read_btn.setFont(fonti);
		update_tbtn.setFont(fonti);
		delete_btn.setFont(fonti);

	}
	private void addcomponentforFrame() {
		frame.add(ad_id_lb);
		frame.add(name_lb);
		
		
		frame.add(ad_id_txf);
		frame.add(name_txf);
		
		
		//Buttons CRUD
		frame.add(insert_btn);
		frame.add(Read_btn);
		frame.add(update_tbtn);
		frame.add(delete_btn);
		
	}
	


	



	public static void main(String[] args) {
		adversariesForm adf=new adversariesForm();


	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

