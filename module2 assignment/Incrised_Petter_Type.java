package Module2;

import java.util.Scanner;

public class Incrised_Petter_Type
{
	

	  private static Scanner in;

	public static void main(String[] args)

	{
	   		int i,j,n,k=1;

	   		System.out.print("Input number of rows : ");

	   		in = new Scanner(System.in);
			    n = in.nextInt();

	   		for(i=1;i<=n;i++)
	   		{
			for(j=1;j<=i;j++)
		   	System.out.print(k++);
		   	System.out.println("");
		   	}  		
		}

}