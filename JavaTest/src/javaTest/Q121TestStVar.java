package javaTest;

public class Q121TestStVar {

	public static int stVar = 100;
	public int var = 200;
	
	public String toString() {
		return var + ":" + stVar;	
	}

	public static void main(String[] args) {
		
		Q121TestStVar t1 = new Q121TestStVar();
		
		//System.out.println(t1);
		
		t1.var = 300;
		
		System.out.println(t1); // 300 : 100

		Q121TestStVar t2 = new Q121TestStVar();
		
		//System.out.println(t2);
		
		t2.stVar = 300;
		
		System.out.println(t2); // 200 : 300
		
	}

}
/*
 	What is the result?
 	
  	Answ: 300:100
		  200:300 
		  
*/