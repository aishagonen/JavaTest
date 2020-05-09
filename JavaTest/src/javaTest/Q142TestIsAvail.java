package javaTest;
//SQ:60
public class Q142TestIsAvail {

	public static void main(String[] args) {
		
		Q142TestIsAvail ts = new Q142TestIsAvail();
		
		System.out.print(isAvailable + " ");
		
		isAvailable = ts.doStuff();
		
		System.out.println(isAvailable);

	}
	
	public static boolean doStuff() {
		return !isAvailable;
	}
	
	static boolean isAvailable = false;

}


/*
	Answ: false true

*/