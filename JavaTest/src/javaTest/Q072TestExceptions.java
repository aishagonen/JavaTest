package javaTest;

//SQ:120

class MyException extends RuntimeException {
	
}

public class Q072TestExceptions {

	public static void main(String[] args) {
		
		try {
			method1();
		} catch (MyException ne) {
			System.out.println("A");
		}
	}
	
	public static void method1() { 	//line n1
		try {
			throw Math.random() > 0.5 ? new MyException() : new RuntimeException(); 
		} catch (RuntimeException re) {
			System.out.println("B");
		}
		
	}
	
	
//	public static void method1() { 	//line n1   -->> 'throws Exception' olmali.
//		try {
//			throw 3 > 10 ? new MyException() : new IOException(); 
//		} catch (IOException ie) {
//			System.out.println("I");
//		} catch (Exception re) {
//			System.out.println("B");
//		}
//	}

}



/*
	What is the result?
	
	A. A
	B. B
	C. Either A or B
	D. A B
	E. A compile time error occurs at line n1
	
	Answ: B
	
	Second version: I
	
	public static void method1() { 	//line n1   -->> 'throws Exception' olmali.
		try {
			throw 3 > 10 ? new MyException() : new IOException(); 
		} catch (IOException ie) {
			System.out.println("I");
		} catch (Exception re) {
			System.out.println("B");
		}
	}
	
	Answ: I


*/