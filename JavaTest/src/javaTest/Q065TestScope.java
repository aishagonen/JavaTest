package javaTest;
//SQ:104
public class Q065TestScope {

	public static void main(String[] args) {
		
		int var1 = 200;
		
		System.out.println(doCalc(var1));	//400
		System.out.println(" " + var1);		//200

	}
	
	static int doCalc(int var1) {
		var1 = var1 * 2;
		return var1;
	}

	
}



/*
	A. 400 200
	B. 200 200
	C. 400 400
	D. Compilation fails.


	Answ: A
	
*/