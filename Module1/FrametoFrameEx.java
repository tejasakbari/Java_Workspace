package com2_1.java;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrametoFrameEx implements ActionListener
{
	
	JFrame frame;
	JButton btn1;
	
	public FrametoFrameEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		
		btn1 = new JButton("Button 1");
		
		btn1.addActionListener(this);
		
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args)
	{
		
		new FrametoFrameEx();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn1)
		{
			Operations o =new Operations();
			o.secondframe();
		}
	}
	
}
class Operations
{
	
		JFrame frame2;
		
		public void secondframe()
		{
			frame2 =new JFrame();
			frame2.setSize(500,500);
			frame2.setLayout(new FlowLayout());
			frame2.setVisible(true);
		}
		
	
}


