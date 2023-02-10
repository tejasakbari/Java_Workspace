package task8_2;
import java.util.Scanner;

public class AreaofCircle {
	
	 public static void main (String[] args)
	
	 {
		 float PI=(float)3.14;
		 int r=0;
		 
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter your Redius");
		 r=sc.nextInt();
		 
		 double area = PI*r*r;
		 System.out.println(area);
	 }
}
