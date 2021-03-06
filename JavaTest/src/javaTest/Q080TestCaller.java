package javaTest;
//SQ:78 

class Caller {
	
	private void init() {
		System.out.println("Initialized");
	}
	
	private void start() {
		init();
		System.out.println("Started");
	}
	
}

public class Q080TestCaller {

	public static void main(String[] args) {
		
		Caller c = new Caller();
		
 		c.start();
		c.init();
			
	}
}

/*
	What is the result?
	A. An exception is thrown at runtime.
	B. Initialized Started Initialized
	C. Initialized Started
	D. Compilation fails

	Answ: D

*/