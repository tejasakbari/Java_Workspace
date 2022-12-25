package com.java;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputDialogEx 
{
	JFrame frame;
	
	public InputDialogEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
		
		String name = JOptionPane.showInputDialog(frame, "Enter Your Name");
		System.out.println("Welcome "+name);
	}
	
	public static void main(String[] args) 
	{
		
		new InputDialogEx();
	}
}