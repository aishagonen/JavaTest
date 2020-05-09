package javaTest;

//SQ: 109
class B13CD {

	int r;
	
	B13CD(int r) {
		this.r = r;
		
	}
	
}
public class Q013DVD extends B13CD{

	int c;
	
	Q013DVD(int r, int c) { 	//'c'kendinde var, 'this.c' olmali. 'r' kendinde yok, superden almali.so 'super(r)
		// line n1
		
	}
	
	public static void main(String[] args) {

		Q013DVD dvd = new Q013DVD(10, 20);
		
		//System.out.println(dvd.r);
		
	}

}


/*
  Whic code should be use at line n1 to instantiate the dvd object successfully? 
 
  Answ: super(r);
		this.c = c;
  
  
 */