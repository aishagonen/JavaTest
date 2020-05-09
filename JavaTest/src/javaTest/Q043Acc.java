package javaTest;
//SQ: 59

// package p1;
public class Q043Acc {

	int p;
	private int q;
	protected int r;
	public int s; 	
	
	
}



/**
package p2;
import ee.Q043Acc;

public class Test extend Q043Acc {
	
	public static void main(String[] args) {
		
		Q043Acc obj = new Test();

	}

}*/



/* 
	 - Which statement is true? 
	 
	 A. Both p and s are accessible by obj.
	 B. Only s is accessible by obj.
	 C. Both r and s are accessible by obj.
	 D. p,r, and s are accessible by obj. 
 
 	Answ: B.
  
	  # public --> her yerden ulasilabilir. So s is accessible. 
	  # private --> kendi classindan ulasabilir. So q is NOT accessible.
	  # default --> same packagedan ulasilabilir. so p is NOT accessible.
	  # protected --> same package or ChildClasstan veya ChildClass'tan olusturulan objeyle ulasilabilir. 
	  				  Ancak burada obje SuperClasstan uretildigi icin protected'i goremez. So r is NOT accessible. 
	  					
	  					SuperClass obj = new SubClass;
	  					obj.protectedVariable = NoAccess;
	  					
	  					SubClass obj = new SubClass;
	  					obj.protectedVariable = access;
	  
	  
  
  
  
 */
	












*/