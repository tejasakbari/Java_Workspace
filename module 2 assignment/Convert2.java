package Module2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Convert2 
{

	public static void main(String[] args) 
	{

		HashSet<String> h_set = new HashSet<String>();

		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash Set: " + h_set);

		List<String> list = new ArrayList<String>(h_set);

		System.out.println("ArrayList contains: " + list);

	}

}