package javaTest;
//SQ: 26 & 137 / Q:K104
public class Q037Check {

	static int count = 0; 
	int i = 0;
	
	public void changeCount() {
		while (i<10) {
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		
		Q037Check check1 = new Q037Check();
		Q037Check check2 = new Q037Check();
		
		//check1.cC() and check2.cC()... ==> 0
		check1.changeCount(); // ==> 10
		check2.changeCount(); // ==> 10
		
		System.out.println(check1.count + ":" + check2.count);
		System.out.println(check1.i + ":" + check1.count +" / "+ check2.i+ ":" + check2.count);		
		 
	}

}

/*
	A. 10:10
	B. 5:5
	C. 5:10
	D. Compilation fails. 
	
	
	Answ: 10:10
	
	
	
	
	
	Answ: A. 10:10
	
*/