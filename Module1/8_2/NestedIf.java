package task8_2;

import java.util.Scanner;

public class NestedIf 
{
	 public static void main(String[] args)
	   {
	      int a, b, c, large;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      a = scan.nextInt();
	      System.out.print("Enter the Second Number: ");
	      b = scan.nextInt();
	      System.out.print("Enter the Third Number: ");
	      c = scan.nextInt();
	      
	      if(a>b && a>c)
	         large = a;
	      else if(b>a && b>c)
	         large = b;
	      else
	         large = c;
	      
	      System.out.println("\nLargest = " +large);
	   }
}
