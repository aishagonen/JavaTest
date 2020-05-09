package javaTest;
//SQ: 49

public class Q073App {

	String myStr = "7007";
	
	public void doStuff(String str) {
		
		int myNum = 0;
		
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} 
		catch (NumberFormatException ne) {
			System.err.println("Error");	
		} 
		System.out.println("myStr: " + myStr + ", myNum: " + myNum);
	}
	
	public static void main(String[] args) {

		Q073App obj = new Q073App();
		
		obj.doStuff("9009"); 
		
	
	}
}


/*
 	Answ: myStr: 7007, myNum: 9009
 	
 	
  *  obj.doStuff("9009a"); -->  outp: Error myStr: 7007, myNum: 0
 	
 	
 	
 	
 	
 */