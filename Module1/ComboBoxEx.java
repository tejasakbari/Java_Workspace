package com12.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx 
{
	JFrame frame;
	JComboBox<String> cb;
	String city[]= {"Rajkot","Surat","Baroda"};
	JButton btn1;
	
	public ComboBoxEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		cb =new JComboBox<>(city);
		cb.setBounds(198, 11, 80, 20);
	
		btn1=new JButton("Submit");
		btn1.setBounds(189, 42, 89, 23);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			//  int a = (int) cb.getItemAt(cb.getSelectedIndex());
			  //System.out.println(a);	
				
				String data = "Selected: "   + cb.getItemAt(cb.getSelectedIndex());  
				
				System.out.println(data);
			}
		});
		
		frame.add(cb);
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) 
	{
		new ComboBoxEx();
	}
}
