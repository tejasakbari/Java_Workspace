package corejava;
import java.util.Scanner;

public class pertten 
{

		public static void main(String[] args) 
		{
			
			System.out.println("Enter Number of Rows:");
			Scanner sc =new Scanner(System.in);
			int row = sc.nextInt();
			
			for(int i=1;i<=5;i++)//row
			{
				for(int j=1;j<=i;j++)//col
				{
					//System.out.print("*");
					//System.out.print(i);
					System.out.print(j);
				}
				System.out.println();
			}
			
		
	}


}
