package javaTest;
//SQ:2
public class Q055Var {
 
	public static void main(String[] args) {
		
		int iVar = 100;
		float fVar = 100.100f;
		double dVar = 123;
		iVar = fVar;
		fVar = iVar;
		dVar = fVar;
		fVar = dVar;
		dVar = iVar;
		iVar = dVar;
	
	}

}


/*
	Which three lines fail to compile?
	
	A. Line 10
	B. Line 11
	C. Line 12
	D. Line 13
	E. Line 14
	F. Line 15


	Answ: 10, 13, 15

	int < long < float < double  
	
*/