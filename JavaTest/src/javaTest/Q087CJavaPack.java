package javaTest;
//SQ:31 / Q:95

//A.java:
//package p1;

public class A {
	
}

//B.java:
//package p1.p2;

// line n1

public class B {
	
	public void doStuff() {
		A b = new A();
	}
	
}

//C.java:
//package p3;

// line n2

public class Q087CJavaPack {

	public static void main(String[] args) {
		
		A o1 = new A();
		B o2 = new B();

	}

}

/*
	 Which modification enables the code to compile?
	
	A. Replace line n1 with:import p1.*;Replace line n2 with:import p1. p2.*;
	B. Replace line n1 with:import p1. A;Replace line n2 with:import p1.*;
	C. Replace line n1 with:import p1. A;Replace line n2 with:import p1. A;import p1. p2.B ;
	D. Replace line n1 with:import p1;Replace line n2 with:import p1;import p1. p2;
 
 	Answ: 
 
 
 
 */
