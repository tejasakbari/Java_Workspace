package ENCAPSULATION_INHERITANCE;

public class ThisKeywordEx
{
	int id;
	String name;
	
	public ThisKeywordEx(int id,String name) 
	{
	
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		
		ThisKeywordEx t1 =new ThisKeywordEx(101,"A");
		ThisKeywordEx t2 =new ThisKeywordEx(102,"b");
		
		t1.display();
		t2.display();
		
	}
}
