package javaTest;
//SQ:70

class Vehicle {
	
	int x;
	
	Vehicle() {
		this(10); 	//line n1
	}
	
	Vehicle(int x) {
		this.x = x;
	}	
}

public class Q053Car extends Vehicle {

	int y;
	
//	Q053Car() {
//		super();	
//		//this(20);   // line n2
//	}
//	
//	Q053Car(int y) {
//		this.y = y;
//	}
	
	Q053Car() {
		super(10);	// line n2	   
	}
 
	 Q053Car(int y) {
	 	super(y);
		this.y = y;
	}
	
	public String toString() {
		return super.x + ":" + this.y;
	}
 	
	public static void main(String[] args) {
		
		Vehicle y = new Q053Car(20);
		
		System.out.println(y);
		

	}

}

/*
 
 	Answ: Compilation fails at line n2.
 
 
 	2nd version: 
 	 
	* 	Q053Car() {
			super(10);	// line n2	   
		}
	 
	*	 Q053Car(int y) {
		 	super(y);
			this.y = y;
		}
	 
	 *	Vehicle y = new Q053Car(20);
	 
	 
	 
 */
