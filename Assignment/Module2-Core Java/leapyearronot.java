package corejava;

public class leapyearronot 
{
	public static void main(String[] args) 
	{
		int year =2016;
		boolean leap = false;
		
		if (year % 4 == 0)
		{
			if(year % 100 == 0) 
			{
				if(year % 400==0)
					leap = true;
				else
					leap = false;
			
				System.out.println("executed");
			}
			else
			{
				leap  = false;
				if (leap)
					System.out.println(year+ "is aleap year.");
				else
					System.out.println(year+ "is aleap year.");
			}
				
		}
	}


}
