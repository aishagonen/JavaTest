package javaTest;
//SQ: 95
class A07Vehicle {

	String type = "4W";
	int maxSpeed = 100;

	
	A07Vehicle(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
	
//	A07Vehicle(){
//	}
	
}


class Q007Car extends A07Vehicle{

	String trans;

	Q007Car(String trans) {		// line n1
		//super();
		this.trans = trans;
	}

	Q007Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this(trans);			// line n2
		//this.trans = trans;
	}

	public static void main(String[] args) {
		
		Q007Car c1 = new Q007Car("Auto");
		Q007Car c2 = new Q007Car("4W", 150, "Manual");
		
		System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
		System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
	}

}

/*
  	What is the result?
  	A. 4W 100 Auto 4W 150 Manual
  	B. Null 0 Auto 4W 150 Manual
  	C. Compilation fails only at line n1
  	D. Compilation fails only at line n2
  	E. Compilation fails only at line n1 and line n2
  	
	Answ: Compilation fails at both line n1 and line n2.
	
  	
 	outp: Implicit super constructor A07Vehicle() is undefined. Must explicitly invoke another constructor
	Constructor call must be the first statement in a constructor. 
	
	
	- this() and super() ayni yerde kullanilamaz. 
	- Obje olustururken superClass'in parametresiz constructor'ini calsitiririz. 
	
		
	
 */


