package javaTest;
//SQ:85 
public class Q136Definition {

	public static void main(String[] args) {
		
	}

}

/*

	Which two class definitions fail to compile? 
	
	A. abstract class A3 { private static int i; public void doStuff(){} public A3(){}} --> ok
	B. final class A1 { public A1() {} }												--> ok
	C. public class A2 { private static int i; private A2() {} }						--> ok - constrc.private olabilir. Final ve abstract olamaz. 
	D. class A4 {protected static final int i; private void doStuff() {} }				--> final tanimliyorsak deger vermemiz gerekir. 
	E. final abstract class A5 { protected static int i; void doStuff() {} abstract void dolt(); --> abstarct, final olamaz.

	Answ: D,E





*/