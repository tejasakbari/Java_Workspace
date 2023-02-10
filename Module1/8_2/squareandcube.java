package task8_2;

import java.util.Scanner;

public class squareandcube
{
	   public static void main(String args[])
	    {
	        int num,a,b,c; 
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.print("Enter The Number :\n\n");
	        num = sc.nextInt();
	 
	  a=num;
	  b=num*num;
	  c=num*num*num;

	  System.out.println("\nOutput Is = " + a + " ,"+ b +" ,"+ c +"\n\n"); 
	 }
	} 


