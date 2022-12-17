package ENCAPSULATION_INHERITANCE;
class P
{
	void p()
	{
		System.out.println("P1 Executed");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q1 Executed");
	}
}
class R extends Q
{
	void r()
	{
		System.out.println("R1 Executed");
	}
}

public class MultilevelEx
{
	public static void main(String[] args) 
	{
		
		R r1 =new R();
		
		r1.p();
		r1.q();
		r1.r();
		
	}
}
