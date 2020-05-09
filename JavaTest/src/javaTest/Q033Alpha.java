package javaTest;
// SQ: 88
class Q033Alpha {

	int ns;			
	static int s;  
	
	Q033Alpha(int ns) {
		if (s<ns) {
			s = ns;
			this.ns = ns;
		}
	}
	
	void doPrint() {
		System.out.println("ns= " + ns + " s = " + s);
	}
		
	public static void main(String[] args) {
		
		Q033Alpha ref1 = new Q033Alpha(50);
		Q033Alpha ref2 = new Q033Alpha(125);
		Q033Alpha ref3 = new Q033Alpha(100);
		
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
	
		
	}
}	
	

/*
 	What is the result?
 	
 	A. 	ns = 50 s = 125
 		ns = 125 s = 125
 		ns = 100 s = 125
 	
 	B. 	ns = 50 s = 125
 		ns = 125 s = 125
 		ns = 0 s = 125
 		
 	C. 	ns = 50 s = 50
 		ns = 125 s = 125
 		ns = 100 s = 100
 		
 	D. 	ns = 50 s = 50
 		ns = 125 s = 125
 		ns = 0 s = 125
 	
 	
 	- static int s :  bir deger vermedigimiz icin default olarak  s=0.
 	
 	Answ: B
 	
 	
 */





