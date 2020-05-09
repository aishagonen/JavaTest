package javaTest;
//SQ:107

class Q96A {
	
	public void test() {
		System.out.println("A");
	}
}

class Q96B extends Q96A {
	
	public void test() {
		System.out.println("B");
	}
}

public class Q096Ccasting extends Q96A {

	public void test() {
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		
		Q96A b1 = new Q96A();
		Q96A b2 = new Q096Ccasting();
		
		b1 = (Q96A) b2;				// line n1
		
		//Q96A b3 = (Q96B) b2;		// line n2 
		//Q96A b3 = (Q96B) b2;		// line n2   ???? yanlislik? 
		
		b1.test();
		//b3.test();
		
		

	}

}



/*
	What is the result?
	A. AB
	B. AC
	C. CC
	D. A ClassCastException is thrown only at line n1.
	E. A ClassCastException is thrown only at line n2.


*/
