package javaTest;

public class Q039TestJavaHello {

	public static void main(String[] args) {
		
		//if (args[0].equals("Hello") ? false : true) {
		
		if ("Hello-".equals("Hello") ? false : true) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
		

	}

}

/*
 	And given the commands: 
	 	javac Test.Java
	 	Java Test Hello-
	 What is the result? 
	 
	 A. Success
	 B. Failure
	 C. Compilation fails
	 D. An exception is thrown at runtime
	 	
	Answ: Success
	 	
	 	
 	
*/

