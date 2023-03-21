package Module2;

import java.util.ArrayList;

public class IterateThroughArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> Coding = new ArrayList<>();
		
		Coding.add("Java");
		Coding.add("JavaScript");
		Coding.add("Python");
		Coding.add("Android");
		Coding.add("IOS");
		
		
		for (String string : Coding) {
			System.out.println(string);
		}
	}
}