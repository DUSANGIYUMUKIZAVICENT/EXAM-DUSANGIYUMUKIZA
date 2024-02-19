package Forms.all;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tblresultsform implements ActionListener{
	JFrame frame;
	JLabel id_lb=new JLabel("id");
	JLabel studentid_lb=new JLabel("studentid");
	JLabel classid_lb=new JLabel("classid");
	JLabel subjectid_lb=new JLabel("subjectid");
	JLabel marks_lb=new JLabel("marks");
	JLabel updatingdate_lb=new JLabel("updatingdate");
	JLabel postingdate_lb=new JLabel("postingdate");
	   
	JTextField id_txf=new JTextField();
	JTextField studentid_txf=new JTextField();
	JTextField classid_txf=new JTextField();
	JTextField subjectid_txf=new JTextField();
	JTextField marks_txf=new JTextField();
	JTextField updatingdate_txf=new JTextField();
	JTextField postingdate_txf=new JTextField();

    //Buttons CRUD
	JButton insert_btn=new JButton("Insert");
	JButton Read_btn=new JButton("View");
	JButton update_tbtn=new JButton("Update");
	JButton delete_btn=new JButton("Delete");
	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	int w=(int) screensize.getWidth();
	int h=(int) screensize.getHeight();
	public tblresultsform() {
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
		frame.getContentPane().setBackground(Color.pink);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
	}


	private void setLocationandSize() {
		id_lb.setBounds(10, 10, 100, 30);
		studentid_lb.setBounds(10, 50, 130, 30);
		classid_lb.setBounds(10, 90, 130, 30);
		subjectid_lb.setBounds(10, 130, 160, 30);
		marks_lb.setBounds(10, 170, 150, 30);
		updatingdate_lb.setBounds(10, 210, 130, 30);
		postingdate_lb.setBounds(10, 250, 130, 30);
		
		id_txf.setBounds(170, 10, 130, 30);
		studentid_txf.setBounds(170, 50, 130, 30);
		classid_txf.setBounds(170, 90, 130, 30);
		subjectid_txf.setBounds(170, 130, 130, 30);
		marks_txf.setBounds(170, 170, 130, 30);
		updatingdate_txf.setBounds(170, 210, 130, 30);
		postingdate_txf.setBounds(170, 250, 130, 30);
		
		
        //Buttons CRUD
		insert_btn.setBounds(20,370, 85, 30);
		Read_btn.setBounds(110,370, 85, 30);
		update_tbtn.setBounds(200,370, 85, 30);
		delete_btn.setBounds(290,370, 85, 30);
		}
	private void setFontforall() {
		Font font = new Font("Times New Roman", Font.BOLD, 20);

		id_lb.setFont(font);
		studentid_lb.setFont(font);
		classid_lb.setFont(font);
		subjectid_lb.setFont(font);
		marks_lb.setFont(font);
		updatingdate_lb.setFont(font);
		postingdate_lb.setFont(font);
		
		id_txf.setFont(font);
		studentid_txf.setFont(font);
		classid_txf.setFont(font);
		subjectid_txf.setFont(font);
		marks_txf.setFont(font);
		updatingdate_txf.setFont(font);
		postingdate_lb.setFont(font);
	
		Font fonti = new Font("Courier New", Font.ITALIC, 12);

		insert_btn.setFont(fonti);
		Read_btn.setFont(fonti);
		update_tbtn.setFont(fonti);
		delete_btn.setFont(fonti);

	}
	private void addcomponentforFrame() {
		frame.add(id_lb);
		frame.add(studentid_lb);
		frame.add(classid_lb);
		frame.add(subjectid_lb);
		frame.add(marks_lb);
		frame.add(updatingdate_lb);
		frame.add(postingdate_lb);
		
		
		frame.add(id_txf);
		frame.add(studentid_txf);
		frame.add(classid_txf);
		frame.add(subjectid_txf);
		frame.add(marks_txf);
		frame.add(updatingdate_txf);
		frame.add(postingdate_txf);
		
		
		//Buttons CRUD
		frame.add(insert_btn);
		frame.add(Read_btn);
		frame.add(update_tbtn);
		frame.add(delete_btn);
		
	}
	


	
	
	

	public static void main(String[] args) {
		tblresultsform mtf=new tblresultsform();	

	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
