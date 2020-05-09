package javaTest;
//SQ:30
public class Q079ny {

	public static void main(String[] args) {
		
		int n[][] = {{1,3},{2,3}};
		
		for (int i = n.length-1; i >= 0; i--) {
			for (int y : n[i]) {
				System.out.print(y);	
			}			
		}
		
	
	}
}

/*
 	What is the result?
	
	Answ: 2313

2nd version: 

 	*	int n[][] = {{1,3},{2,4}};
		
		for (int i = n.length-1; i >= 0; i--) {
			for (int j = n[i].length-1; j >= 0; j--) {
				System.out.print(n[i][j]);	
			}			
		}
	
	
	
	Answ: 4231
	



*/