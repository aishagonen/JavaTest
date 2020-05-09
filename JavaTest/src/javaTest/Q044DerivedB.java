package javaTest;
//SQ: 1

//Base.java:
class Base {
	
	public void test() {
		System.out.println("Base ");
	}
}


//DerivedA.java:
class DerivedA extends Base {
	
	public void test() {
		System.out.println("DerivedA ");
	}
	
}

//DerivedB.java:
public class Q044DerivedB extends DerivedA{

	public void test() {
		System.out.println("DerivedB ");
	}
	
	public static void main(String[] args) {
		
		Base b1 = new Q044DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new Q044DerivedB();
		
		b1 = (Base) b3;
		
		//b1 = (Base) b2;
		
		Base b4 = (DerivedA) b3;
		
		b1.test();
		b4.test();

				
	}

}


/*
   Answ: DerivedB
   		 DerivedB
 	
 	
  2nd version:  
  
  	*	Base b4 = b3;
		b1 = (Base) b2;
		
		b1.test();
		b4.test();
  
  
  Answ:  DerivedA 
  		 DerivedB
  
  
  

  
  
  
 */





