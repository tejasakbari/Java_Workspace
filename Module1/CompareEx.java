package Polymorphism;

public class CompareEx 
{
public static void main(String[] args) {
		
		String s1 ="sachin";
		String s2= "sachin";
		String s3="saurav";
		String s4="SACHIN";		
		String s5 =new String("sachin");
		String s6 ="ratan";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	
		
		System.out.println(s1.equals(s5));
		System.out.println(s1==s5);
		
		System.out.println(s1.compareTo(s6));
	}
}
