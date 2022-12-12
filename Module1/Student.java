package obb;
import java.util.Scanner;

public class Student 
{static int id=0;
static String name="";

public static void main(String[] args) 
{
	

	
	Student s1 = new Student();
	
	
	
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter your id");
	int id2=sc.nextInt();
	
	System.out.println("Enter your name");
	String name2=sc.next();
	
	s1.id=id2;
	s1.name=name2;
	
	
	System.out.println(s1.id+" "+s1.name);
	
	
	
}
}
	


