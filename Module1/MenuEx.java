package COM4_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuEx implements ActionListener
{
	JFrame frame;
	JMenu menu,menu2,menu3;
	JMenuBar menuBar;
	JMenuItem item1,item2,item3,item4,item5;
	JTextArea ta;
	
	public MenuEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		menuBar =new JMenuBar();
		
		menu =new JMenu("File");
		menu2 =new JMenu("Edit");
		menu3 =new JMenu("Help");
		
		ta =new JTextArea();
		ta.setBounds(5,5,360,320);    
		
		
		item1 =new JMenuItem("Cut");
		item2 =new JMenuItem("Copy");
		item3 =new JMenuItem("Paste");
		item4 =new JMenuItem("Select All");
		item5 =new JMenuItem("Xyz");
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		
		
		menuBar.add(menu);
		menuBar.add(menu2);
		menuBar.add(menu3);
		
		menu2.add(item1);
		menu2.add(item2);
		menu2.add(item3);
		menu2.add(item4);
		menu2.add(item5);
		
		
		frame.setJMenuBar(menuBar);
		frame.add(ta);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	
	}
	
	public static void main(String[] args) 
	{
		new MenuEx();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==item1)
		{
			ta.cut();
		}
		if(e.getSource()==item2)
		{
			ta.copy();
		}
		if(e.getSource()==item3)
		{
			ta.paste();
		}
		if(e.getSource()==item4)
		{
			ta.selectAll();
		}
	}
}

