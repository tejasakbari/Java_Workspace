package ENCAPSULATION_INHERITANCE;
interface M
{
	void m();
}
interface N
{
	void n();
}
class K implements M,N
{

	@Override
	public void n() 
	{
	
		System.out.println("N executed");
	}


	public void m() 
	{
		
		System.out.println("M executed");
	}
	
}

public class MultipleEx 
{
public static void main(String[] args) {
		
		
		K k1 =new K();
		k1.m();
		k1.n();
		
	}
}
