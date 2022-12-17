package ENCAPSULATION_INHERITANCE;
class A1
{
	void a1()
	{
		System.out.println("A1 Executed");
	}
}
class B1 extends A1
{
	void b1()
	{
		System.out.println("B1 Executed");
	}
}
public class SinglelnEx 
{
	public static void main(String[] args) 
	{
		B1 b =new B1();
		
		b.a1();
		b.b1();
		
	}
}
