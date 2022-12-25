package com.java;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConfirmDialogEx extends WindowAdapter
{
	JFrame frame;
	
	public ConfirmDialogEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		frame.addWindowListener(this);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new ConfirmDialogEx();
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		
		   int a=JOptionPane.showConfirmDialog(frame,"Are you sure?");  
		
		   if(a==JOptionPane.YES_OPTION)
		    {  
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			}  
	}
	
}