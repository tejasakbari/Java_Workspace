package com2_1.java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx implements ActionListener
{
	JFrame frame;
	JButton btn1;
	
	public PanelEx()
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
		
		new PanelEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn1)
		{
			
			Operations2 o =new Operations2();
			o.second();
			
		}
	}
}

class Operations2
{
	JFrame frame2;
	JPanel jp,jp2;
	JButton btn2,btn3;
	
	public void second()
	{
		frame2 =new JFrame();
		
		jp =new JPanel();
		
		jp2 =new JPanel();
		
		btn2=new JButton("Button 2");
		btn3=new JButton("Button 3");
		
		jp.add(btn2);
		jp2.add(btn3);
		
		jp2.setVisible(false);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				jp.setVisible(false);
				jp2.setVisible(true);
				
			}
		});
		
		//jp.add(jp2);
		frame2.add(jp);
		frame2.add(jp2);
		frame2.setSize(500,500);
		frame2.setLayout(new FlowLayout());
		frame2.setVisible(true);
	}
	
}
