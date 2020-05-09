package javaTest;
//SQ:103
class A {
	
	
	public A() {
		System.out.println("A ");
	}
}

class B extends A {
	
	public B() {				// line n1
		System.out.println("B ");
	}
}

public class Q027ABC extends B {

	public Q027ABC() {				// line n2
		System.out.println("C ");
	}
	
	public static void main(String[] args) {
		
		Q027ABC c = new Q027ABC();

//		B b = new Q027ABC();
//		A a = new Q027ABC();
//
//		B d = new B(); 
//		A q = new B();
//	
		
	}

}


/*
 	Answ: A B C 


	Constructor'lardaki super();'lari unutma!

*/