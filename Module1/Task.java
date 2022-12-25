package com.java;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Task implements ActionListener
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JButton btn1,btn2,btn3;
	
	public Task() 
	{
		frame = new JFrame("Create Profile");
		
		
		l1 =new JLabel("Registration Form");
		l1.setBounds(166, 40, 146, 14);
		l1.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		
		l2 = new JLabel("Registration no:");
		l2.setBounds(100, 80, 146, 14);
		
		l3 = new JLabel("Student name:");
		l3.setBounds(100, 120, 146, 14);
		
		l4 = new JLabel("Batch:");
		l4.setBounds(100, 160, 146, 14);
		
		l5 = new JLabel("Department:");
		l5.setBounds(100, 200, 146, 14);
		
		l6 = new JLabel("Address");
		l6.setBounds(100, 240, 146, 14);
		
		tf1 =new JTextField();
		tf1.setBounds(200, 80, 146, 20);
		
		tf2 =new JTextField();
		tf2.setBounds(200, 120, 146, 20);
		
		tf3 =new JTextField();
		tf3.setBounds(200, 160, 146, 20);
	
		tf4 =new JTextField();
		tf4.setBounds(200, 200, 146, 20);
		
		tf5 =new JTextField();
		tf5.setBounds(200, 240, 146, 20);
		
		btn1 = new JButton("Reset");
		btn1.setBounds(100, 310, 146, 30);
		
		btn2 = new JButton("Register");
		btn2.setBounds(300, 310, 146, 30);
		
		btn3 = new JButton("Back");
		btn3.setBounds(20, 510, 146, 30);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(tf5);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.setSize(500,700);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Task();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn1)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
		}
		if(e.getSource()==btn2)
		{
				String s1="\n Registration No:";
				String r_no = tf1.getText().toString();
				
				String s2="\n Student Name:";
				String s_name=tf2.getText().toString();
				
				String s3="\n Batch:";
				String Batch = tf3.getText().toString();
				
				String s4="\n Department:";
				String department = tf4.getText().toString();
				
				String s5="\n Address:";
				String address = tf5.getText().toString();
				
				try 
				{
					FileOutputStream fout =new FileOutputStream("E://Tejas.txt");
					fout.write(s1.getBytes());
					fout.write(r_no.getBytes());
					fout.write(s2.getBytes());
					fout.write(s_name.getBytes());
					fout.write(s3.getBytes());
					fout.write(Batch.getBytes());
					fout.write(s4.getBytes());
					fout.write(department.getBytes());
					fout.write(s5.getBytes());
					fout.write(address.getBytes());
					System.out.println("Success");
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//fout.write(r_no.getBytes());
				
				
		}
		if(e.getSource()==btn3)
		{
				System.exit(0);
			
		}
	}
	
}
