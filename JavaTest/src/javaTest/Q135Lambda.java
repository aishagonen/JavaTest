package javaTest;
//SQ:93 - Lambda ile ilgili. 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q135Lambda {

	public static void main(String[] args) {
		
		String[] arr = {"Hi,", "How", "Are", "You"};

		List<String> arrList = new ArrayList<>(Arrays.asList(arr);
		
		if (arrList.removeIf((String s) -> (return s.length() <= 2;))) {
			System.out.println( s+"removed");
		
	}

}
	
/*
	What is the result?
	
	A. Compilation fails.
	B. Hi removed
	C. An UnsupportedOperationException is thrown at runtime.
	D. The program compiles, but it prints nothing.
	
	Answ:  A 
	Degismis haliyle 'removed' cikmis. 
	
	
	 
	 
 */
