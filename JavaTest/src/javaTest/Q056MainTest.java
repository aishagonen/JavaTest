package javaTest;
//SQ:131 

//MainTest.java:
public class Q056MainTest {

	public static void main(int[] args) {
		System.out.println("int main " + args[0]);
	}

	public static void main(Object[] args) {
		System.out.println("Object main " + args[0]);
	}
	
	public static void main(String[] args) {
		System.out.println("iString main " + args[0]);
	}
	
}
/*
	And commands:
	
		javac MainTest.java
		java MainTest 1 2 3 	 *****  2nd version: java MainTest  "1 2 3"
		
	What is the result?
	
	A. int main 1
	B. Object main 1
	C. iString main 1
	D. Compilation fails
	E. An exception is thrown at runtime
		
	Answ: C. iString main1
		

*/