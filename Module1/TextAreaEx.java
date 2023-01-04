package COM4_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TextAreaEx implements ActionListener
{
	JFrame frame;
	JTextArea area;
	JLabel l1,l2; 
	JButton b;
	
	
	public TextAreaEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		l1=new JLabel();  
		l1.setBounds(250,25,100,30);  
		 
		l2=new JLabel();  
		l2.setBounds(350,25,100,30);  
		
		area =new JTextArea();
		area.setBounds(10,30, 200,200);  
		
		b=new JButton("Count Words");  
		b.setBounds(100,300,120,30);  
		
		b.addActionListener(this);
		
		
		frame.add(area);
		frame.add(l1);
		frame.add(l2);
		frame.add(b);
		
		frame.setSize(500,500);  
		frame.setLayout(null);  
		frame.setVisible(true); 
	}
	
	public static void main(String[] args)
	{
		new TextAreaEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			 String text=area.getText();  
			 String words[]=text.split("\\s");
			 l1.setText("Words Are :"+words.length);
			 l2.setText("Charcater Are: "+text.length());
		}
	}
}
