package obb;
import java.util.Scanner;

public class pattern1Ex 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter Number of Rows:");
		Scanner sc =new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
