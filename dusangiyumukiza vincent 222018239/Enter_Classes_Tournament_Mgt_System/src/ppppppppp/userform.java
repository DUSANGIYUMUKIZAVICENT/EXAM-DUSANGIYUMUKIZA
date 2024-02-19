package ppppppppp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class userform implements ActionListener{
	JFrame frame;
	JLabel user_id_lb=new JLabel("user_id");
	JLabel u_name_lb=new JLabel("u_name");
	JLabel u_password_lb=new JLabel("u_password");
   
	JTextField user_id_txf=new JTextField();
	JTextField u_name_txf=new JTextField();
	JTextField u_password_txf=new JTextField();

    //Buttons CRUD
	JButton insert_btn=new JButton("Insert");
	JButton Read_btn=new JButton("View");
	JButton update_tbtn=new JButton("Update");
	JButton delete_btn=new JButton("Delete");
	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	int w=(int) screensize.getWidth();
	int h=(int) screensize.getHeight();
	public userform() {
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
		user_id_lb.setBounds(10, 10, 100, 30);
		u_name_lb.setBounds(10, 50, 130, 30);
		u_password_lb.setBounds(10, 90, 130, 30);
		
		user_id_txf.setBounds(170, 10, 130, 30);
		u_name_txf.setBounds(170, 50, 130, 30);
		u_password_txf.setBounds(170, 90, 130, 30);

		
        //Buttons CRUD
		insert_btn.setBounds(10,270, 85, 30);
		Read_btn.setBounds(100,270, 85, 30);
		update_tbtn.setBounds(190,270, 85, 30);
		delete_btn.setBounds(280,270, 85, 30);
		}
	private void setFontforall() {
		Font font = new Font("Times New Roman", Font.BOLD, 20);

		user_id_lb.setFont(font);
		u_name_lb.setFont(font);
		u_password_lb.setFont(font);
		
		user_id_txf.setFont(font);
		u_name_txf.setFont(font);
		u_password_txf.setFont(font);
	
		Font fonti = new Font("Courier New", Font.ITALIC, 12);

		insert_btn.setFont(fonti);
		Read_btn.setFont(fonti);
		update_tbtn.setFont(fonti);
		delete_btn.setFont(fonti);

	}
	private void addcomponentforFrame() {
		frame.add(user_id_lb);
		frame.add(u_name_lb);
		frame.add(u_password_lb);
		
		
		
		frame.add(user_id_txf);
		frame.add(u_name_txf);
		frame.add(u_password_txf);
		
		
		
		//Buttons CRUD
		frame.add(insert_btn);
		frame.add(Read_btn);
		frame.add(update_tbtn);
		frame.add(delete_btn);
		
	}
	


	
	
	

	public static void main(String[] args) {
		userform mtf=new userform();	

	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
