package obb;

public class paraEx
{
	int id;
	String name;
	
	public paraEx(int id,String name)
	{
		this.id=id;
		this.name=name;
		
		
	}
     void display()
     {
    	 System.out.println(id+""+name);
    	 
     }
  public static void main (String[]args)
  
  {
	paraEx p1 = new  paraEx  (101,"tejas");
	paraEx p2 = new  paraEx  (102,"raj");
	
	p1.display();
	p2.display();
	
	
	
  }
}
