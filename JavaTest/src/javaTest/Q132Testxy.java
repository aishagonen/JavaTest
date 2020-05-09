package javaTest;
//SQ:67

public class Q132Testxy {

	int x, y;
	
	public Q132Testxy(int x, int y) {
		initialize(x,y);
	}
	
	public void initialize(int x, int y) {
		this.x = x * x;
		this.y = y * y;
	}
	
	public static void main(String[] args) {
		
		int x = 3, y = 5;

		Q132Testxy obj = new Q132Testxy(x,y);
		
		System.out.println(x + " " + y);
		//System.out.println(obj.x + " " + obj.y);
	}

}


/*
		What is the result?
		A. Compilation fails.
		B. 3 5
		C. 0 0
		D. 9 25
		
		Answ: 3 5
		
		'object.x' ve 'object.y' deseydi yukariya constructora cikip oradan isleme girecektik. 
		Ama direct 'x, y'yi sordugu icin main method'daki field'daki degerleri alir.  

*/