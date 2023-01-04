package COM4_1;

import javax.swing.*;

public class TableEx {

	JFrame f;
	JTable jt;
	public TableEx()
	{
		// TODO Auto-generated constructor stub
		f =new JFrame();
		
		 String column[]={"ID","NAME","SALARY"};
		 
		 String data[][]={ 
				 				{"101","Amit","670000"},    
				 				{"102","Jai","780000"},    
				 				{"101","Sachin","700000"}
				 				
				 				
				 		 };  
		 
		 
		 jt=new JTable(data,column);  
		 jt.setBounds(30,40,200,300);    
		 JScrollPane sp=new JScrollPane(jt);
		 f.add(sp);
		 f.setSize(300,400);    
		 f.setVisible(true);    
		 
	}

	public static void main(String[] args) {

		new TableEx();

	}
}
