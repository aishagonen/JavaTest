package javaTest;
//SQ:112
public class Q086TestBoolJava {

	public static void main(String[] args) {
		
		boolean a = new Boolean(Boolean.valueOf(args[0]));
		boolean b = new Boolean(args[1]);
		
		System.out.println(a + " " + b);
		
		
	}

}

/*
	And given the commands: 
	javac Test.java
	java Test TRUE null 
	
	What is the result?

	A. TRUE null
	B. true false
	C. false false
	D. true true
	E. A ClassCastExceptionis thrown at runtime.

*/