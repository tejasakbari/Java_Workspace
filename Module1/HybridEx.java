package ENCAPSULATION_INHERITANCE;

class G
{
	void g()
	{
		System.out.println("G Executed");
	}
}
class H extends G
{
	void h()
	{
		System.out.println("H executed");
	}
}
interface J
{
	void j();
}
class V extends H implements J
{
	void v()
	{
		System.out.println("V executed");
	}

	
	public void j() 
	{
		
		System.out.println("J executed");
	}
}

public class HybridEx 
{
	public static void main(String[] args) {
		
		V v1 =new V();
		
		v1.g();
		v1.h();
		v1.j();
		v1.v();
		
		
	}
}


