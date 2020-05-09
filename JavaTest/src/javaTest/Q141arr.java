package javaTest;
//SQ:110
public class Q141arr {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4};
		
		int i = 0;
		
		do {
			System.out.println(arr[i] + " "); 
			i++;		
		} while (i< arr.length-1);

	}

}


/*
	What is the result?
	
	A. 1 2 3 4 followed by an ArrayIndexOutOfBoundsException
	B. 1 2 3
	C. 1 2 3 4
	D. Compilation fails.

	Answ: 1 2 3

*/