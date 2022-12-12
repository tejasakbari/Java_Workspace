import java.util.Scanner;
public class percentade {
	private static final String Average = null;
	private static Scanner sc;
	public static void main(String[] args)
	{
		int english,hindi,gujrati,maths,computer;
		float total,percentage,average;
		sc =new Scanner(System.in);
		
		System.out.println("please Enter the 5 subject Marks");
		english = sc.nextInt();
		hindi = sc.nextInt();
		gujrati = sc.nextInt();
		maths = sc.nextInt();
		computer = sc.nextInt();
		
		total = english+hindi+gujrati+maths+computer;
	    average = total /5;
	    percentage = (total / 500) *100;
	    
	    System.out.println("Totl Marks = "+total);
	    System.out.println("Average Marks = "+Average);
	    System.out.println(" Markspercentage = "+percentage);

	    
		
	}

}
