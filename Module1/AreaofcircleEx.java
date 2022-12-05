import java.util.Scanner;
public class AreaofcircleEx {
	
	public static void main(String[] args)
	{
             float PI=(float)3.14;
             int r=0;
             
             Scanner sc =new Scanner(System.in);
             System.out.println ("Enter your Radius");
             r=sc.nextInt();
             
             double area = PI*r*r;
             System.out.println(area);
	}
}
