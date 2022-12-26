package com12.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckboxEx 
{
	
	JFrame frame;
	JCheckBox chk1,chk2,chk3;
	JButton btnorder;
	
	
	public CheckboxEx() 
	{
		// TODO Auto-generated constructor stub
	
		frame =new JFrame();
		
		chk1 =new JCheckBox("Pizza @ rs.100");
		chk1.setBounds(168, 10, 110, 23);
		
		chk2 =new JCheckBox("Burger @ rs.70");
		chk2.setBounds(168, 40, 130, 23);
		
		chk3 =new JCheckBox("Coffee @ rs.120");
		chk3.setBounds(168, 70, 130, 23);
		
		btnorder =new JButton("ORDER");
		btnorder.setBounds(168, 120, 97, 23);
		
		btnorder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					StringBuilder builder =new StringBuilder();
					builder.append("\n Selectd Items:");
					int amount =0;
					
					
					if(chk1.isSelected())
					{
						amount+=100;
						builder.append("\n Pizza - rs.100");
					}
				
					if(chk2.isSelected())
					{
						amount+=70;
						builder.append("\n Burger - rs.70");
					}
				
					if(chk3.isSelected())
					{
						amount+=120;
						builder.append("\n Coffee - rs.120");
					}
					
					builder.append("\n Total:"+amount);
					String bill = builder.toString();
					JOptionPane.showMessageDialog(frame, bill);
			}
		});
		
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btnorder);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		
		new CheckboxEx();
		
	}
}
