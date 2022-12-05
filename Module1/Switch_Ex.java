import java.util.Scanner;

public class Switch_Ex {
          
	     public static void main(String[] args)
	     {
	    	 //int nub = 4;
	    	 Scanner sc = new Scanner(System.in);
	    	 System.out.println("Enter your Number");
	    	 int num = sc.nextInt();
	    	 
	    	 switch(num)
	    	 {
	    	 case 1:
	    		 System.out.println("english");
	    		 break;
	    		 
	    	 case 2:
	    		 System.out.println("hindi");
	    		 break;
	    		 
	    	 case 3:
	    		 System.out.println("gujrati");
	    		 break;
	    		 
	    		 default:System.out.println("Your Number is not valid");
	    		 
	    	 }
	     }
}
