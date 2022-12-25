package com.java;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageDialogEx 
{
	JFrame frame;
	
	public MessageDialogEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JOptionPane.showMessageDialog(frame, "Hello It's a Warning Message!!");
		
	}
	
	public static void main(String[] args) 
	{
		
		new MessageDialogEx();
	}
}