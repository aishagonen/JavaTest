package javaTest;
//SQ: 6
public class Q071App {

	public static void main(String[] args) {
		
		Boolean[] bool =new Boolean[2];
		
		bool[0] = new Boolean(Boolean.parseBoolean("true"));
		bool[1] = new Boolean(null);
		
		System.out.println(bool[0] + " " + bool[1]);

	}

}


/*
	What is the result?
	
	A. True false
	B. True null
	C. Compilation fails
	D. A NullPointerException is thrown at runtime
	

	Answ: A


The parseBoolean() method of Boolean Class is a built in static method of the class java.lang.
Boolean which is used to convert a given string to its boolean value.
Parameters: It takes one parameter value of type string which contains the value which is to be converted to boolean.
Return Value: It returns a primitive boolean value. It returns the true if the given value is equals “true” ignoring cases. 
Else it returns false.





*/